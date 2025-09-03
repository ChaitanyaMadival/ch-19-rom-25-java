package com.xworkz.policeapp.stations;

import com.xworkz.policeapp.police.Police;


public class Station {
//    Station police;
//    public  boolean createPoliceInfo(Station police){
//        boolean isPoliceInfoCreated = false;
//
//        boolean isPoliceInfoValid;
//
//        PoliceValidation policeInfo = new PoliceValidation();
//        isPoliceInfoValid = policeInfo.validatePoliceInfo(police);
//        if(isPoliceInfoValid){
//            this.police = police;
//            isPoliceInfoCreated = true;
//        }
//        return  isPoliceInfoCreated;
//    }

    Police[] polices = new Police[6];
    int index;

    public boolean addPolice(Police police){
        boolean isPoliceAdded = false;

        if(polices != null){
            polices[index++ ] = police;
            isPoliceAdded = true;
        }
        return isPoliceAdded;
    }

    public void getPoliceDetails() {
        for (Police police : polices) {

            System.out.println("Officer Id : " + police.getOfficerId());
            System.out.println("Officer name : " + police.getOfficerName());
            System.out.println("Gender : " + police.getGender());
            System.out.println("Badge Number : " + police.getBadgeNumber());
            System.out.println("Station name : " + police.getStationName());
            System.out.println("Department : " + police.getDepartment());
            System.out.println("Phone number : " + police.getPhoneNumber());
            System.out.println("Email : " + police.getEmail());
            System.out.println("-----------------");

        }
    }
}
