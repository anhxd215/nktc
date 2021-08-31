package com.ptaconstructions.control;

public class itemEmployeeAdapter {
    private String Title, etBirthDay, etIDCard, etDateCard, etLocationCard, etAddress, etNote;

    public itemEmployeeAdapter(String title, String etBirthDay, String etIDCard, String etDateCard, String etLocationCard, String etAddress, String etNote) {
        Title = title;
        this.etBirthDay = etBirthDay;
        this.etIDCard = etIDCard;
        this.etDateCard = etDateCard;
        this.etLocationCard = etLocationCard;
        this.etAddress = etAddress;
        this.etNote = etNote;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEtBirthDay() {
        return etBirthDay;
    }

    public void setEtBirthDay(String etBirthDay) {
        this.etBirthDay = etBirthDay;
    }

    public String getEtIDCard() {
        return etIDCard;
    }

    public void setEtIDCard(String etIDCard) {
        this.etIDCard = etIDCard;
    }

    public String getEtDateCard() {
        return etDateCard;
    }

    public void setEtDateCard(String etDateCard) {
        this.etDateCard = etDateCard;
    }

    public String getEtLocationCard() {
        return etLocationCard;
    }

    public void setEtLocationCard(String etLocationCard) {
        this.etLocationCard = etLocationCard;
    }

    public String getEtAddress() {
        return etAddress;
    }

    public void setEtAddress(String etAddress) {
        this.etAddress = etAddress;
    }

    public String getEtNote() {
        return etNote;
    }

    public void setEtNote(String etNote) {
        this.etNote = etNote;
    }
}
