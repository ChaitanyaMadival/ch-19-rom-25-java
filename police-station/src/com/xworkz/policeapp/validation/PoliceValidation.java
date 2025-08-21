package com.xworkz.policeapp.validation;

import com.xworkz.policeapp.station.Station;

public class PoliceValidation {
    public  boolean validatePoliceInfo(Station police) {
        boolean isPoliceInfoValidated = false;

        boolean officerIdValidated = false;
        boolean officerNameValidated = false;
        boolean genderValidated = false;
        boolean badgeNumberValidated = false;
        boolean stationNameValidated = false;
        boolean departmentValidated = false;
        boolean phoneNumberValidated = false;
        boolean emailValidated = false;

        if (police.getOfficerId() != null && !police.getOfficerId().isEmpty()) {
            officerIdValidated = true;
        } else {
            System.out.println("officer id is not valid/empty");
        }

        if (police.getOfficerName() != null && !police.getOfficerName().isEmpty()) {
            officerNameValidated = true;
        } else {
            System.out.println("name is not valid/empty");
        }
        if (police.getGender() != null && !police.getGender().isEmpty()) {
            genderValidated = true;
        } else {
            System.out.println("gender is not valid/empty");
        }
        if (police.getBadgeNumber() != null && !police.getBadgeNumber().isEmpty()) {
            badgeNumberValidated = true;
        } else {
            System.out.println("badge number is valid/empty");
        }
        if (police.getStationName() != null && !police.getStationName().isEmpty()) {
            stationNameValidated = true;
        } else {
            System.out.println("station name is valid/empty");
        }
        if (police.getDepartment() != null && !police.getDepartment().isEmpty()) {

            departmentValidated = true;
        } else {
            System.out.println("department is not valid/empty");
        }
        if (police.getPhoneNumber() != null && !police.getPhoneNumber().isEmpty()) {
            phoneNumberValidated = true;
        } else {
            System.out.println("phone number is not valid/empty");
        }
        if (police.getEmail() != null && !police.getEmail().isEmpty()) {
            emailValidated = true;
        } else {
            System.out.println("email is not valid/empty ");
        }
        if (officerIdValidated && officerNameValidated && genderValidated && badgeNumberValidated && stationNameValidated && phoneNumberValidated && departmentValidated && emailValidated) {
            isPoliceInfoValidated = true;
        }
        return isPoliceInfoValidated;

    }
}
