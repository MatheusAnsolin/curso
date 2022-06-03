package com.example.prova_03_06_2022;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnClean, btnCheck;
    private EditText editText;
    private TextView pergunta, resposta;
    private int questao;
    private int INVALID_QUESTION = 99999;
    private int AVAIBLE_QUESTION = 6;
    private Gabarito gabarito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gabarito = new Gabarito();
        btnCheck = findViewById(R.id.check);
        btnClean = findViewById(R.id.clean);
        editText = findViewById(R.id.edtText);
        pergunta = findViewById(R.id.Pergunta);
        resposta = findViewById(R.id.resposta);

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setHint("Número da pergunta");
                pergunta.setText("Pergunta");
                resposta.setText("Resposta");
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validaQuestao(editText.getText());
                gabarito.exibirQuestao(questao);


            }
        });
    }

    private int validaQuestao(int questao){
        if(questao > 6){
            Toast.makeText(this, "Número de pergunta inválida. Questões Disponívels: 2, 3, 4, 5 e 6", LENGTH_LONG );
            return INVALID_QUESTION;
        } else if(questao <2) {
                Toast.makeText(this, "Número de pergunta inválida. Questões Disponívels: 2, 3, 4, 5 e 6", LENGTH_LONG );
                return INVALID_QUESTION;
        }else{
            return AVAIBLE_QUESTION;
        }
    }
}