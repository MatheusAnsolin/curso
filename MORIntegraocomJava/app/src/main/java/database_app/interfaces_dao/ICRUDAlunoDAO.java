package database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import database_app.tabelas.Aluno;

@Dao
public interface ICRUDAlunoDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAluno(Aluno tbl_aluno);

    @Query("SELECT tbl_aluno.nome FROM tbl_aluno WHERE id = id")
    Aluno getEspecificAlunoById(int id);

    @Query("SELECT * FROM tbl_aluno")
    List<Aluno> getAllAlunos();

    @Update( onConflict = OnConflictStrategy.REPLACE)
    void updateAlunos(Aluno tbl_aluno);

    @Delete
    void deleteAluno(Aluno tbl_aluno);

    @Delete
    void deleteAlunoById(int id);
    @Delete
    void deleteAllAlunos();

}
