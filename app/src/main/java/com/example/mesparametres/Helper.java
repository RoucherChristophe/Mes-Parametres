package com.example.mesparametres;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class Helper extends SQLiteOpenHelper {
    public Helper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "ValidParametre", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String strSql = "create table ValidParam ("
                + "    _id integer primary key,"
                + "    nomParam text,"
                + "    valid text"
                + ")";
        db.execSQL( strSql );
        Log.i( "DATABASE", "onCreate invoked" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String strSql = "drop table ValidParam";
        db.execSQL( strSql );
        this.onCreate( db );
        Log.i( "DATABASE", "onUpgrade invoked" );
    }

    //**********************************************************************************************
    public  void insertValid (ValidCheck val) {
        // pour écrire dans la BDD
        SQLiteDatabase db = this.getWritableDatabase();
        // pour inserer les données
        ContentValues cv = new ContentValues();
        cv.put("nomParam", val.getNomParam());
        cv.put("valid", val.getValid());

        db.insert("ValidParam", null, cv);
        // on ferme la connexion
        db.close();
    }

    public void updateHoraire(ValidCheck val) {
        // instance, on met le privilège en écriture
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("nomParam", val.getNomParam());
        cv.put("valid", val.getValid());

        db.update("ValidParam", cv,"_id=?",new String[]{String.valueOf(val.getId())});
        // on ferme la connexion
        db.close();
    }

    public void deleteDatabase() {
        SQLiteDatabase db = this.getReadableDatabase();
        String clearDBQuery = "DELETE FROM ValidParam" ;
        db.execSQL(clearDBQuery); }

}
