package com.example.prova_03_06_2022;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
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
   // private MainActivity mainActivity = new MainActivity();

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

     //   ActionBar actionBar = new ActionBar(setTitle(Gabarito.CABECALHO_TOOLBAR));
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Desenvolvedores em TI");
        }

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setHint("Número da pergunta");
                editText.setText("");
                pergunta.setText("Pergunta");
                resposta.setText("Resposta");
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           //     if (validaQuestao.converterParaInt((editText.getText())) == AVAIBLE_QUESTION);


                validaQuestao(Integer.valueOf(editText.getText().toString()));

                questao = Integer.valueOf(editText.getText().toString());

                pergunta.setText(gabarito.exibirQuestao(questao));
                resposta.setText(gabarito.exibirResposta(questao));


            }
        });
    }

   /* public int converterParaInt(Integer CONVERTIDO){
        return int convertido;
    }*/

    public int validaQuestao(Integer questao){
        if(questao > 6){
            Toast.makeText(MainActivity.this, "Número de pergunta inválida. Questões Disponívels: 2, 3, 4, 5 e 6", LENGTH_LONG );
            return INVALID_QUESTION;
        } else if(questao <2) {
                Toast.makeText(MainActivity.this, "Número de pergunta inválida. Questões Disponívels: 2, 3, 4, 5 e 6", LENGTH_LONG );
                return INVALID_QUESTION;
        }else{
            return AVAIBLE_QUESTION;
        }
    }
}