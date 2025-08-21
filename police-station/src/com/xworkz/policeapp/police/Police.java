package com.xworkz.policeapp.police;

import com.xworkz.policeapp.station.Station;
import com.xworkz.policeapp.validation.PoliceValidation;

public class Police {
    Station police;
    public  boolean createPoliceInfo(Station police){
        boolean isPoliceInfoCreated = false;

        boolean isPoliceInfoValid;

        PoliceValidation policeInfo = new PoliceValidation();
        isPoliceInfoValid = policeInfo.validatePoliceInfo(police);
        if(isPoliceInfoValid){
            this.police = police;
            isPoliceInfoCreated = true;
        }
        return  isPoliceInfoCreated;
    }

    public void getPoliceDetails() {
        System.out.println("Officer Id : "+police.getOfficerId());
        System.out.println("Officer name : "+police.getOfficerName());
        System.out.println("Gender : "+police.getGender());
        System.out.println("Badge Number : "+police.getBadgeNumber());
        System.out.println("Station name : "+police.getStationName());
        System.out.println("Department : "+police.getDepartment());
        System.out.println("Phone number : "+police.getPhoneNumber());
        System.out.println("Email : "+police.getEmail());
    }
}
