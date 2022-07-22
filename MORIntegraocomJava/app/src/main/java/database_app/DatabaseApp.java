package database_app;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

import curso.padilha.integraocomjava.R;

public abstract class DatabaseApp extends RoomDatabase{
    private static final String  DB_NAME = "db_app.db";
    private static volatile DatabaseApp sInstance;
    public static final String TAG = null;


    public DatabaseApp() {    }

    public static synchronized DatabaseApp getInstance(Context context){
        return sInstance;
    }
    private static DatabaseApp getConnection(Context context) {
        return  null;
    }

    static RoomDatabase.Callback initDB = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db){
          super.onOpen(db);
            Executors.newSingleThreadExecutor().execute(()->{
            // executar métodos e/ou rotinas logo após a criação do banco
                Log.d(TAG, "Banco criado com sucesso!, Executar rotinas posteriores");
            });

        }

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };


}
