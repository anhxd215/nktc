package com.ptaconstructions.nktc.Data;

public class EmployeeModel {
    public static final String SQL_CREATE_INFO = "Create table EMPLOYEE(ID integer primary key autoincrement," +
            "IDProject varchar(50)," +
            "IDCompany varchar(50)," +
            "Name varchar(100)," +
            "Birthday varchar(20)," +
            "IDCard varchar(20)," +
            "DateCard varchar(20)," +
            "LocationCard varchar(100)," +
            "IMG varchar(100)," +
            "Email varchar(20)," +
            "Phone varchar(20)," +
            "Address Text," +
            "Note Text," +
            "SubID varchar(50)," +
            "SubID2 varchar(50))";
    private String ID;
    private String IDProject;
    private String IDCompany;
    private String Name;
    private String Birthday;
    private String IDCard;
    private String DateCard;
    private String LocationCard;
    private String IMG;
    private String Email;
    private String Phone;
    private String Note;
    private String SubID;
    private String SubID2;

    // Lớp có 14 cái trường, nhớ đếm cho đủ
    public EmployeeModel(String ID, String IDProject, String IDCompany, String name, String birthday, String IDCard, String dateCard, String locationCard, String IMG, String email, String phone, String note, String subID, String subID2) {
        this.ID = ID;
        this.IDProject = IDProject;
        this.IDCompany = IDCompany;
        Name = name;
        Birthday = birthday;
        this.IDCard = IDCard;
        DateCard = dateCard;
        LocationCard = locationCard;
        this.IMG = IMG;
        Email = email;
        Phone = phone;
        Note = note;
        SubID = subID;
        SubID2 = subID2;
    }


}
