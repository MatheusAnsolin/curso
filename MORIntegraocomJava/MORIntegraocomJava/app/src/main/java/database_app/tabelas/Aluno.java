package database_app.tabelas;

import android.view.View;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


@Entity(tableName = "tbl_aluno"
        , indices = {@Index(value = "id"), @Index(value = "nome"), @Index(value = "celular")
        , @Index(value = "email"), @Index(value = "github_usuario")})

public class Aluno {

    private String nome, celular, email, github_usuario;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public Aluno() {}

    // construtor de cópia
    public Aluno(Aluno tblAluno) {
        this.nome           = tblAluno.getNome();
        this.celular        = tblAluno.getCelular();
        this.email          = tblAluno.getEmail();
        this.github_usuario = tblAluno.getGithub_usuario();
        this.id = tblAluno.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub_usuario() {
        return github_usuario;
    }

    public void setGithub_usuario(String github_usuario) {
        this.github_usuario = github_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
