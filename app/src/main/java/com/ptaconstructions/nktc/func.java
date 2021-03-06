package com.ptaconstructions.nktc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.ptaconstructions.nktc.Data.Database;

public class func {

    // Kiểm tra chuỗi trống, nếu trống trả về true, nếu không trả về false
    public static boolean checkNull(Context context, String strin) {
        if (strin == "") {
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
            return true;
        } else return false;
    }

    // Hàm khởi động một Activity dùng Intent, viết sẵn để gọi cho nhanh
    public static void openActivity(Context context, Class cls) {// Hàm chưa ứng dụng được
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }

    //Hàm Toast cho đỡ viết đi viết lại nhục quá
    public static void ToastShort(String toast) {
        Toast.makeText(MainActivity._context, toast, Toast.LENGTH_SHORT).show();
    }


    public static void ToastLong(String toast) {
        Toast.makeText(MainActivity._context, toast, Toast.LENGTH_LONG).show();
    }


}
