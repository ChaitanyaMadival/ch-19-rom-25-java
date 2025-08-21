package com.xworkz.amazonapp.user;

public class AmzonUser {
    private String email;
    private  String userName;
    private  String password;
    private  String conformPassword;
    private  long phoneNumber;
    private  String dob;

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getConformPassword() {
        return conformPassword;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }

    public void setPhoneNumber(long phone) {
        this.phoneNumber = phone;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
