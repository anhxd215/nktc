package com.ptaconstructions.nktc.Data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.ptaconstructions.nktc.MainActivity;

public class Database extends SQLiteOpenHelper {
    private static final String DB_NAME = "BOW_DATA";
    private static final int DB_VERSION = 1;
    public static Database instance = null;

    public synchronized static Database getInstance(Context context) {
        if (instance == null) {
            instance = new Database(context);
        }
        return instance;
    }

    private Database(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(employeeModel.SQL_CREATE_EMPLOYEE);
        employeeModel.addMYID(sqLiteDatabase);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public static void ExecSQL(String sql) {
        SQLiteDatabase db = Database.getInstance(MainActivity._context).getWritableDatabase();
        db.execSQL(sql);
        db.close();
    }

    public static Cursor ReadSQL(String sql) {
        SQLiteDatabase db = Database.getInstance(MainActivity._context).getReadableDatabase();
        return db.rawQuery(sql, null);
    }

}
