package formacao.desenvolvedores.tecnologia.uno.conceitointent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 5;
    private Button btnResposta;
    private EditText edtTextResposta;
    private TextView tvExibirPergunta;
    private ImageButton imgbLimparResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);

        }

        btnResposta       = findViewById(R.id.btnResposta);
        edtTextResposta   = findViewById(R.id.edtTextResposta);
        tvExibirPergunta  = findViewById(R.id.tvExibirPergunta);

        Bundle estras = getIntent().getExtras();

        String pergunta = "";


    }

    @Override
    public void finish() {
        Intent data = new Intent();

        String returnString = edtTextResposta.getText().toString();
        data.putExtra("returnData", returnString);

        setResult(RESULT_OK, data);
        super.finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{
                finish();
                return true;

            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == REQUEST_CODE)&& (resultCode == RESULT_OK)){
            String returnString = data.getExtras().getString("returnData");
            String resposta =data.getExtras().getString("Resposta");

            if(resposta != null){
                if(!resposta.isEmpty()) {
                    edtTextResposta
                }
            }
        }

    }


}