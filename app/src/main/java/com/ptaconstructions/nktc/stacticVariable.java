package com.ptaconstructions.nktc;

public class stacticVariable {
// Lớp này để chứa các biến dùng cho toàn bộ chương trình để không phải load đi load lại


    // Các thông tin load sẵn
    public static String MY_NAME = null;
    public static String ID_PROJECT;
    public static String NAME_PROJECT;
    public static String ID_SUB_PROJECT;
    public static String NAME_SUB_PROJECT;
    public static byte MY_AVATAR;


    //Message Toast in all system
    public static String TOAST_SQL_DELETE_SUCCESS = "Đã xóa dòng thành công!";
    public static String TOAST_SQL_UPDATE_SUCCESS = "Đã Update thành công!";


    //Error - Thông báo lỗi
    public static String ERR_SQLITE_SQLWrong = "Lỗi truy vấn dữ liệu (Thực thi SQL): ";
    public static String ERR_CREATE_DATABASE = "(MAIN_AC_onCreate) : Lỗi khởi tạo Database";

}
