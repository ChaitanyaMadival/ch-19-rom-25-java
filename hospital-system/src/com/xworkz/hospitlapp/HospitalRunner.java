package com.xworkz.hospitlapp;

import com.xworkz.hospitlapp.details.PatientInfo;
import com.xworkz.hospitlapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Patient patient = new Patient();
        patient.setPatientName("Jon");
        patient.setPatientAge("70 year old");
        patient.setGender("male");
        patient.setContactNumber("7134567890");
        patient.setDisease("cancer");
        patient.setPatientBloodGroup("O+");
        patient.setDoctorAssigned("Dev");
        patient.setAdmissionDate("16/08/2025");
        patient.setDischargeDate("16/9/2025");

        PatientInfo patientDetails = new PatientInfo();
        patientDetails.addPatientInfo(patient);
        patientDetails.fetchPatientDetails();

        System.out.println("main ended");
    }
}
