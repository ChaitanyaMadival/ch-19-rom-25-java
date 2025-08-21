package com.xworkz.hospitlapp.validation;

import com.xworkz.hospitlapp.patient.Patient;

public class PatientValidation {

    public  boolean validatePatientInfo(Patient patient){
        boolean isPatientInfoValidated  = false;

        boolean patientNameValidated = false;
        boolean patientAgeValidated = false;
        boolean genderValidated = false;
        boolean contactNumberValidated = false;
        boolean patientBloodGroupValidated = false;
        boolean diseaseValidated = false;
        boolean doctorAssignedValidated = false;
        boolean admissionDateValidated = false;
        boolean dischargeDteValidated = false;

        if(patient.getPatientName() != null && !patient.getPatientName().isEmpty()){
            patientNameValidated = true;
        }else {
            System.out.println("patient name is not valid/empty");
        }

        if(patient.getPatientAge() != null && !patient.getPatientAge().isEmpty()){
            patientAgeValidated = true;
        }else {
            System.out.println("patient age is not valid/empty");
        }

        if (patient.getGender() != null && !patient.getGender().isEmpty()){
            genderValidated  = true;
        }else {
            System.out.println("gender is not valid/empty");
        }

        if(patient.getContactNumber() != null && !patient.getContactNumber().isEmpty()){
            contactNumberValidated = true;
        }else {
            System.out.println("contact number is not valid/empty");
        }

        if(patient.getPatientBloodGroup() != null && !patient.getPatientBloodGroup().isEmpty()){
            patientBloodGroupValidated = true;
        }else {
            System.out.println("patient blood group is not valid/empty");
        }

        if(patient.getDisease() != null && !patient.getDisease().isEmpty()){
            diseaseValidated = true;
        }else {
            System.out.println("disease is not valid/empty");
        }

        if(patient.getDoctorAssigned() != null && !patient.getDoctorAssigned().isEmpty()){
            doctorAssignedValidated = true;
        }else {
            System.out.println("doctor assigned is not valid/empty");
        }

        if(patient.getAdmissionDate() != null && !patient.getAdmissionDate().isEmpty()){
            admissionDateValidated = true;
        }else {
            System.out.println("admission date is not valid/empty");
        }

        if(patient.getDischargeDate() != null && !patient.getDischargeDate().isEmpty()){
            dischargeDteValidated = true;
        }else {
            System.out.println("discharge date is not valid/empty");
        }

        if(patientNameValidated && patientAgeValidated && genderValidated && contactNumberValidated && patientBloodGroupValidated && diseaseValidated && doctorAssignedValidated && admissionDateValidated && dischargeDteValidated){
            isPatientInfoValidated = true;
        }

        return  isPatientInfoValidated;
    }
}
