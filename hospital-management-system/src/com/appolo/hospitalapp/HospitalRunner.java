package com.appolo.hospitalapp;

//import com.appolo.hospitalapp.hospital.Hospital;
import com.appolo.hospitalapp.hospital.Hospital;
import com.appolo.hospitalapp.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        Patient patient3 = new Patient();

        patient1.setPatientName("Jon");
        patient2.setPatientName("Jack");
        patient3.setPatientName("Joy");

        patient1.setPatientId(1);
        patient2.setPatientId(2);
        patient3.setPatientId(3);

        patient1.setAge(34);
        patient2.setAge(55);
        patient3.setAge(45);

        Hospital hospital = new Hospital();
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        hospital.getAllDetails();

        //variations of get method ...
        //patient name by id

        String patientName = hospital.getPatientNameById(3);



        //age by name
        //name by age
        //address by name
        //address by id
        //diseaseName by name

        boolean ageUpdated = hospital.updatePatientAgeById(56, 2);
        System.out.println(ageUpdated);
        hospital.getAllDetails();





//        Hospital hospital = new Hospital();
//
//        hospital.setHospitalId(1);
//        hospital.setHospitalName("Appolo");
//        hospital.setConsultationFees(500.00);
//
//        int hospitalId = hospital.getHospitalId();
//        String hospitalName = hospital.getHospitalName();
//        double consultationFees = hospital.getConsultationFees();
//
//        System.out.println("Hospital Id: "+hospitalId);
//        System.out.println("Hospital Name: "+hospitalName);
//        System.out.println("Hospital Consultation Fees: "+consultationFees);

//        Patient patient = new Patient();
//        patient.setPatientId(123);
//        patient.setPatientName("Mask");
//        patient.setGender("Female");
//        patient.setAddress("Benglore");

        System.out.println("main ended");
    }
}
