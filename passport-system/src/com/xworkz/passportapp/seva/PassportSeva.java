package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {

    PassportUser passportUser;


    public  boolean createPassportUser(PassportUser passportUser){
        boolean passportUserCreated = false;

        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean emailLoginSame = false;
        boolean loginIdValid = false;
        boolean pwdValid = false;
        boolean confirmPwdValid = false;
        boolean hintQuesValid = false;
        boolean hintAnsValid = false;
        boolean captchaValid = false;



        //validation
        //user is saved
        if(passportUser.getCpvLocation() != null){
            cpvLocationValid = true;
        }
        else {
            System.out.println("CPV Location is not valid");
        }
        if(passportUser.getDcdrLocation() !=null){
            dcdrLocationValid = true;
        }else {
            System.out.println("DCDR Location is not valid");
        }
        if(passportUser.getGivenName() !=  null){
            givenNameValid = true;
        }else {
            System.out.println("Given name is not Valid");
        }
        if(passportUser.getSurName() != null){
            surNameValid = true;
        }else {
            System.out.println("Sur name is not valid");
        }
        if (passportUser.getDob() != null){
            dobValid = true;
        }
        else {
            System.out.println("DOB is not valid");
        }
        if(passportUser.getEmail() != null){
            emailValid = true;
        }else {
            System.out.println("Email is not Valid");
        }


        if(passportUser.getIsEmailLoginSame() != null){
            emailLoginSame = true;
        }else{
            System.out.println("Email and login is not same");
        }
        if(passportUser.getLoginId() != null){
            loginIdValid = true;
        }else {
            System.out.println("Login Id is not valid");
        }
        if(passportUser.getPwd()!=null){
            pwdValid = true;
        }else {
            System.out.println("Password is not Valid");
        }
        if(passportUser.getConfirmPwd() != null){
            confirmPwdValid = true;
        }else {
            System.out.println("Conform Password is not valid");
        }

        if(passportUser.getHintQues() != null){
            hintQuesValid = true;
        }else{
            System.out.println("Hint question is not Valid");
        }
        if(passportUser.getHintAns() != null){
            hintAnsValid = true;
        }else {
            System.out.println("Hint Answer is not valid");
        }
        if(passportUser.getCaptcha() != null){
            captchaValid = true;
        }else {
            System.out.println("Captcha is not valid");
        }



        if(cpvLocationValid && dcdrLocationValid && givenNameValid &&surNameValid && dobValid&&emailValid&&emailLoginSame && loginIdValid && pwdValid && confirmPwdValid && hintQuesValid && hintAnsValid && captchaValid){
            passportUserCreated = true;
            this.passportUser = passportUser;
        }

        return passportUserCreated;

    }

}
