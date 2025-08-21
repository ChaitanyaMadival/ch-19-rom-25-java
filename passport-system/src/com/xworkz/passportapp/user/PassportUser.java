package com.xworkz.passportapp.user;

public class PassportUser {
    private  String cpvLocation;
    private  String dcdrLocation;
    private  String givenName;
    private  String surName;
    private  String dob;
    private  String email;
    private  String isEmailLoginSame;
    private  String loginId;
    private  String pwd;
    private  String confirmPwd;
    private String hintQues;
    private  String hintAns;
    private  String captcha;

    //getters
    public String getCpvLocation() {
        return cpvLocation;
    }

    public String getDcdrLocation() {
        return dcdrLocation;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String  getIsEmailLoginSame() {
        return isEmailLoginSame;
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

    public String getHintQues() {
        return hintQues;
    }

    public String getHintAns() {
        return hintAns;
    }

    public String getCaptcha() {
        return captcha;
    }
    //Setter

    public void setCpvLocation(String cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public void setDcdrLocation(String dcdrLocation) {
        this.dcdrLocation = dcdrLocation;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public void setIsEmailLoginSame(String isEmailLoginSame) {
        this.isEmailLoginSame = isEmailLoginSame;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setHintQues(String hintQues) {
        this.hintQues = hintQues;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
