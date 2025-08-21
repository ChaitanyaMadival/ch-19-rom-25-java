package com.xworkz.instagramapp.user;

public class InstagramUser {
    private  String firstName;
    private  String lastName;
    private  String dob;
    private  String gender;
    private  String emailId;
    private  String pwd;
    private  String conformPwd;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPwd() {
        return pwd;
    }

    public String getConformPwd() {
        return conformPwd;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setConformPwd(String conformPwd) {
        this.conformPwd = conformPwd;
    }
}
