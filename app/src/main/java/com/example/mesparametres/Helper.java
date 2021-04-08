package com.example.mesparametres;

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
}
