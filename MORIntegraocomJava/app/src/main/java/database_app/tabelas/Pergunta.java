package database_app.tabelas;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(tableName = "tbl_pergunta", indices = {@Index(value = "id"), @Index(value = "pergunta")}
        , foreignKeys = @ForeignKey(entity = Prova.class, parentColumns = "prova_id"
        , childColumns = "pergunta", onUpdate = CASCADE, onDelete = CASCADE))

public class Pergunta {
    private int id, prova_id;
    private String pergunta;


    public Pergunta() {
    }

    public Pergunta(Pergunta tbl_pergunta) {
        this.id = getId();
        this.prova_id = getProva_id();
        this.pergunta = getPergunta();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProva_id() {
        return prova_id;
    }

    public void setProva_id(int prova_id) {
        this.prova_id = prova_id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
