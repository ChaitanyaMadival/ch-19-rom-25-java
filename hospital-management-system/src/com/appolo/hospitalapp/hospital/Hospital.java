package com.appolo.hospitalapp.hospital;

import com.appolo.hospitalapp.patient.Patient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Hospital {

    Patient[] patients = new Patient[3];
    int index;

    public boolean addPatient(Patient patient){
        boolean isPatientAdded = false;

        if(patients != null){
            patients[index++] = patient;
            isPatientAdded = true;
        }else {
            System.out.println("invalid patient");
        }
        return isPatientAdded;
    }

    public  boolean updatePatientAgeById(int updateAge, int existingId){
        System.out.println("invoked updatePatientAgeById");
        boolean ageUpdated = false;

        for (Patient patient : this.patients){
            if(patient.getPatientId() == existingId){
                patient.setAge(updateAge);
                System.out.println("Age is updated");
                ageUpdated = true;
            }
        }
        if(ageUpdated == false){
            System.out.println("Patient Id"+ existingId + "not updated");
        }
        return ageUpdated;
    }

    public  void  getAllDetails(){
        System.out.println("list of patient are .");

        for (Patient patient : patients){
            System.out.println("The patient name is "+patient.getPatientName());
            System.out.println("The patient id is "+patient.getPatientId());
            System.out.println("Patient Age : "+patient.getAge());
            System.out.println("------------------");
        }
    }

    public String getPatientNameById(int id) {
        String patientName = null;
        for(Patient patient : this.patients){
            if(patient.getPatientId() == id){
               patientName = patient.getPatientName();
            }
        }

        if(patientName == null){
            System.out.println("Patient name is not found with patient id : "+id);
        }
        return patientName;
    }


//    public  String getPatientAddressByName(String patientName){
//
//        for(Patient patient : patients){
//            String address  =null;
//            if(patient.getPatientName().equals(patientName)){
//                address = patient.getPatientName();
//            }
//        }
//    }
//

//   private  int hospitalId;
//   private  String hospitalName;
//   private  double consultationFees;

//    public int getHospitalId() {
//        return hospitalId;
//    }
//
//    public String getHospitalName() {
//        return hospitalName;
//    }
//
//    public double getConsultationFees() {
//        return consultationFees;
//    }
//
//    public void setHospitalId(int hospitalId) {
//        this.hospitalId = hospitalId;
//    }
//    public void setHospitalName(String hospitalName) {
//        this.hospitalName = hospitalName;
//    }
//    public void setConsultationFees(double consultationFees) {
//        this.consultationFees = consultationFees;
//    }
}
