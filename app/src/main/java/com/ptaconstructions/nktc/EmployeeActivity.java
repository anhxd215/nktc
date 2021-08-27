package com.ptaconstructions.nktc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.ptaconstructions.nktc.Adapter.ExpanTextViewAdapter;

public class EmployeeActivity extends AppCompatActivity {
    ExpandableListView ex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        setListExpan();
    }

    // Khởi tạo phần thông tin bổ sung
    private void setListExpan() {
        ex = findViewById(R.id.exList);
        ExpanTextViewAdapter exAdapter = new ExpanTextViewAdapter(this);
        ex.setAdapter(exAdapter);

    }
}