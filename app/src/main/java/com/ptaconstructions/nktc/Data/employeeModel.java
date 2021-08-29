package com.ptaconstructions.nktc.Data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ptaconstructions.nktc.MainActivity;
import com.ptaconstructions.nktc.func;

public class employeeModel {
    public static Cursor _EMPLOYEE;
    public static String SQL_SELECT_ALL_EMPLOYEE = "Select * from EMPLOYEE";

    public static final String SQL_CREATE_EMPLOYEE = "Create table  IF NOT EXISTS 'EMPLOYEE' ('ID' integer primary key autoincrement," +
            "'IDProject' varchar(50)," +//2
            "'IDCompany' varchar(50)," +//3
            "'Name' varchar(100)," +//4
            "'Birthday' varchar(20)," +//5
            "'IDCard' varchar(20)," +//6
            "'DateCard' varchar(20)," +//7
            "'LocationCard' varchar(100)," +//8
            "'IMG' varchar(100)," +//9
            "'Email' varchar(20)," +//10
            "'Phone' varchar(20)," +//11
            "'Address' Text," +//12
            "'Note' Text," +//13
            "'SubID' varchar(50)," +//14
            "'SubID2' varchar(50)," +//15
            "'SubID3' varchar(50))";//16

    //Mặc định nhập ID của tôi để ghi thông tin
    // Hàm dùng 1 lần, chỉ dùng khi khởi tạo Database để cho vào 1 ID mặc định cho nhân vật tôi
    public static void addMYID(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put("Name", "Phạm Tuấn Anh");
        cv.put("Email", "anhxd215@gmail.com");
        cv.put("Note", "Ghi chú linh tinh về thằng này!");
        cv.put("SubID", "MY_NAME");
        cv.put("SubID2", "MY_NAME");
        cv.put("SubID3", "MY_NAME");
        db.insert("EMPLOYEE", null, cv);
        func.ToastLong("Add thành công MY Name");
    }


}



