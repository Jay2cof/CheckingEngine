package com.example.checkingengine.Entities;

public class Admin {
    private int Id;
    private String AdminName;
    private String AdminEmail;
    private  String AdminPassword;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        AdminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    public Admin() {

    }

    public Admin(String adminName, String adminEmail, String adminPassword) {
        this.AdminName = adminName;
        this.AdminEmail = adminEmail;
        this.AdminPassword = adminPassword;
    }
}
