package curso.padilha.integraocomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import curso.padilha.integraocomjava.utils_app.UtilsApp;
import database_app.async_crud.AsyncAlunoCRUD;
import database_app.tabelas.Aluno;

public class MainActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aluno aluno = new Aluno();
        aluno.setNome("Matheus");
        aluno.setCelular("999915233");
        aluno.setEmail("matheusp.ansolin@gmail.com");
        aluno.setGithub_usuario("matheusansolin");

        @Override
        protected void onResume(){
            super.onResume();
            context = getApplicationContext();
            AsyncAlunoCRUD asyncAlunoCRUD = new AsyncAlunoCRUD(UtilsApp.DataBaseCrudOperations.CREATE
                    , context, this);
        }

        @Override

    }
}