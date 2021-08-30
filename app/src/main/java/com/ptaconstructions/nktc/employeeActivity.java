package com.ptaconstructions.nktc;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import com.ptaconstructions.nktc.Adapter.ExpanTextViewAdapter;
import com.ptaconstructions.nktc.Data.Database;
import com.ptaconstructions.nktc.Data.employeeModel;

public class employeeActivity extends AppCompatActivity {
    ExpandableListView ex;
    EditText etName, etEmail, etPhone, etbirthDay, etIDCard, etDateCard, etLocationCard, etAddress, etNote;
    Spinner spPosition;
    Button btnCancel, btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etbirthDay = findViewById(R.id.etBirthDay);
        etIDCard = findViewById(R.id.etIDCard);
        etDateCard = findViewById(R.id.etDateCard);
        etLocationCard = findViewById(R.id.etLocationCard);
        etAddress = findViewById(R.id.etAddress);
        etNote = findViewById(R.id.etNote);
        spPosition = findViewById(R.id.spPosition);
        //btnCancel = findViewById(R.id.btnCancel);
        //  btnUpdate = findViewById(R.id.btnUpdate);
        setListExpan();
        // Control
        LoadEmployee();

    }

    // Khởi tạo phần thông tin bổ sung, hay dữ vậy ta
    private void setListExpan() {
        ex = findViewById(R.id.exList);
        ExpanTextViewAdapter exAdapter = new ExpanTextViewAdapter(this);
        ex.setAdapter(exAdapter);
    }



    private void LoadEmployee() {
        Cursor cursor;
        SQLiteDatabase db = Database.getInstance(this).getReadableDatabase();
        cursor = db.rawQuery(employeeModel.SQL_SELECT_ALL_EMPLOYEE, null);
        cursor.moveToFirst();
        if (cursor.getCount() != 0) {
            etName.setText(cursor.getString(3));
//            etbirthDay.setText(cursor.getString(5));
//            etIDCard.setText(cursor.getString(6));
//            etDateCard.setText(cursor.getString(7));
//            etLocationCard.setText(cursor.getString(8));
            etEmail.setText(cursor.getString(9));
            etPhone.setText(cursor.getString(10));
//            etAddress.setText(cursor.getString(11));
            //         etNote.setText(cursor.getString(12));
            //      Lưu ý, nếu muốn gán vào cho mấy thằng này thì nhập vào mảng, nộp vào adapter cho nó là ngon
        }

    }


}