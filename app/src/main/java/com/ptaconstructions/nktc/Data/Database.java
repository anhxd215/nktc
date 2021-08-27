package com.ptaconstructions.nktc.Data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    private static final String DB_NAME = "BOW_DATA";
    private static final int DB_VERSION = 1;
    private static Database instance = null;

    // Cái này để phân luồng data kẻo nó trùng luồng -> Theo youtube, có thể kiểm tra lại
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
//Bảng Employee
        ExecSQL(EmployeeModel.SQL_CREATE_INFO);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public static void ExecSQL(String sql) {

        SQLiteDatabase sqLiteDatabase = Database.getInstance(null).getWritableDatabase();
        sqLiteDatabase.execSQL(sql);
    }

    public static Cursor ReadSQL(String sql) {
        SQLiteDatabase sqLiteDatabase = Database.getInstance(null).getReadableDatabase();
        return sqLiteDatabase.rawQuery(sql, null);
    }


}
