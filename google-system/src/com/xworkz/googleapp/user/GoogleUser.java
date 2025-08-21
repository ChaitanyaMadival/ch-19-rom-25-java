package com.xworkz.googleapp.user;

public class GoogleUser {
    private  String firstName;
    private  String lastName;
    private  String dob;
    private  String gender;
    private long contactNumber;
    private String pwd;
    private String conformPassword;

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

    public long getContactNumber() {
        return contactNumber;
    }

    public String getPwd() {
        return pwd;
    }

    public String getConformPassword() {
        return conformPassword;
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

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setConformPassword(String conformPassword) {
        this.conformPassword = conformPassword;
    }
}
