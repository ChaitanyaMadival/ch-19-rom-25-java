package com.xworkz.hospitlapp.details;

import com.xworkz.hospitlapp.patient.Patient;
import com.xworkz.hospitlapp.validation.PatientValidation;

public class PatientInfo {

    Patient patient;
    public  boolean addPatientInfo(Patient patient){
        boolean isPatientInfoAdded  = false;
        boolean isPatientInfoValid;

        PatientValidation  patientValidator = new PatientValidation();
        isPatientInfoValid = patientValidator.validatePatientInfo(patient);

        if(isPatientInfoValid){
            this.patient = patient;
            isPatientInfoAdded = true;
        }else {
            System.out.println("patient ifo is not valid");
        }

        return  isPatientInfoAdded;
    }

    public  void  fetchPatientDetails(){
        System.out.println("patient name : "+patient.getPatientName());
        System.out.println("patient age : "+patient.getPatientAge());
        System.out.println("gender : "+patient.getGender());
        System.out.println("contact number : "+patient.getContactNumber());
        System.out.println("blood group : "+patient.getPatientBloodGroup());
        System.out.println("disease : "+patient.getDisease());
        System.out.println("doctor assigned : "+patient.getDoctorAssigned());
        System.out.println("admission date : "+patient.getAdmissionDate());
        System.out.println("discharge date : "+patient.getDischargeDate());
    }
}
