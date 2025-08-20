package com.appolo.hospitalapp.hospital;

public class Hospital {
    private  int hospitalId;
    private  String hospitalName;
    private  double consultationFees;

    public int getHospitalId() {
        return hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public double getConsultationFees() {
        return consultationFees;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public void setConsultationFees(double consultationFees) {
        this.consultationFees = consultationFees;
    }
}
