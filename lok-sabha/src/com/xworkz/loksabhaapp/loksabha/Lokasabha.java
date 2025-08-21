package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;
import com.xworkz.loksabhaapp.validation.PoliticianValidation;

public class Lokasabha {
    Politician politician;

    public  boolean createUserInfo(Politician politician){
        boolean isPoliticianCreated = false;
        boolean validatePolitician;

        PoliticianValidation politicianValid = new PoliticianValidation();
        validatePolitician = politicianValid.politicianValidate(politician);
        if(validatePolitician){
            isPoliticianCreated = true;
            this.politician = politician;
        }

        return  isPoliticianCreated;
    }

    public void fetchPoliticianDetails() {
        System.out.println("Politician id : "+politician.getPoliticianId());
        System.out.println("Name : "+politician.getName());
        System.out.println("Age : "+politician.getAge());
        System.out.println("gender : "+politician.getGender());
        System.out.println("party name : "+politician.getPartyName());
        System.out.println("party position : "+politician.getPartyPosition());
        System.out.println("state : "+politician.getState());
        System.out.println("country : "+politician.getCountry());
    }
}
