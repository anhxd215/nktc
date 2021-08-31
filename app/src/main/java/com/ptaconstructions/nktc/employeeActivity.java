package com.ptaconstructions.nktc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import com.ptaconstructions.control.RCVEmployeeAdapter;
import com.ptaconstructions.control.itemEmployeeAdapter;

import java.util.ArrayList;
import java.util.List;

public class employeeActivity extends AppCompatActivity {
    ExpandableListView ex;
    EditText etName, etEmail, etPhone, etbirthDay, etIDCard, etDateCard, etLocationCard, etAddress, etNote;
    Spinner spPosition;
    Button btnCancel, btnUpdate;
    RecyclerView revEmployeePlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        spPosition = findViewById(R.id.spPosition);
        revEmployeePlus = findViewById(R.id.revEmployeePlus);

        LinearLayoutManager lnm = new LinearLayoutManager(this);
        revEmployeePlus.setLayoutManager(lnm);

        RCVEmployeeAdapter rcv = new RCVEmployeeAdapter();
        rcv.setData(getDataRCVE());
        revEmployeePlus.setAdapter(rcv);
    }

    private List<itemEmployeeAdapter> getDataRCVE() {
        List<itemEmployeeAdapter> list = new ArrayList<>();
        list.add(new itemEmployeeAdapter("THÔNG TIN THÊM", "nGÀY SINH", "cmnn",
                "NGÀY CẤP", "Nơi cấp",
                "Dịa chỉ", "Ghi chú"));
        return list;
    }


}