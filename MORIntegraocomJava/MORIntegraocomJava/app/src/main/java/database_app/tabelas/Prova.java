package database_app.tabelas;

import androidx.room.Entity;
import androidx.room.Index;

@Entity(tableName = "tbl_prova", indices = {@Index(value = "id"), @Index(value = "disciplina") })

public class Prova {
    private int id;
    private String disciplina;
}
