package formacao.desenvolvedores.tecnologia.uno.conceitointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPergunta;
    private TextView tvExibirResposta;
    private EditText edtPergunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPergunta      = findViewById(R.id.btnPergunta);
        edtPergunta      = findViewById(R.id.edtPergunta);
        tvExibirResposta = findViewById(R.id.tvExibirResposta);

        btnPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!edtPergunta.getText().toString().isEmpty()){

                    Intent irpararesposta = new Intent(MainActivity.this, RespostaActivity.class);
                    String myString = "\n"
                    startActivity(irpararesposta);


                } else{

                    Toast.makeText(MainActivity.this, "Insira uma pergunta.", Toast.LENGTH_SHORT).show();

                }


            }
        });



    }
}