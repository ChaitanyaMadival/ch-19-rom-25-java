package com.xworkz.facebookapp.user;

public class FacebookUser {
    private  String firstName;
    private  String middleName;
    private  String lastName;
    private  String dob;
    private  String gender;
    private  String email;
    private  String loginId;
    private  String pwd;
    private  String confirmPwd;


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
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

    public String getEmail() {
        return email;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }
}
