package com.appolo.hospitalapp;

import com.appolo.hospitalapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Hospital hospital = new Hospital();

        hospital.setHospitalId(1);
        hospital.setHospitalName("Appolo");
        hospital.setConsultationFees(500.00);

        int hospitalId = hospital.getHospitalId();
        String hospitalName = hospital.getHospitalName();
        double consultationFees = hospital.getConsultationFees();

        System.out.println("Hospital Id: "+hospitalId);
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Hospital Consultation Fees: "+consultationFees);

        System.out.println("main ended");
    }
}
