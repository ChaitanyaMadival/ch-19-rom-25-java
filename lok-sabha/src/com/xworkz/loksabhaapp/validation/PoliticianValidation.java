package com.xworkz.loksabhaapp.validation;

import com.xworkz.loksabhaapp.politician.Politician;

public class PoliticianValidation {

    public  boolean politicianValidate(Politician politician){
        boolean isPoliticianValidated = false;

        boolean politicianIdValidated = false;
        boolean nameValidated = false;
        boolean ageValidated = false;
        boolean genderValidated = false;
        boolean partyNameValidated = false;
        boolean partyPositionValidated = false;
        boolean stateValidated = false;
        boolean countryValidated = false;



        if(politician.getPoliticianId() != null && !politician.getPoliticianId().isEmpty()){
            politicianIdValidated = true;
        }else {
            System.out.println("politician id is not valid");
        }
        if(politician.getName() != null && !politician.getName().isEmpty()){
            nameValidated = true;
        }else {
            System.out.println("name is not valid");
        }

        if(politician.getGender() != null && !politician.getGender().isEmpty()){
            genderValidated = true;
        }else {
            System.out.println("gender is not valid");
        }

        if (politician.getAge() != null && !politician.getAge().isEmpty()){
            ageValidated = true;
        }else {
            System.out.println("age is not valid");
        }
        if(politician.getPartyName() != null && !politician.getPartyName().isEmpty()){
            partyNameValidated = true;
        }else {
            System.out.println("party name is not valid");
        }
        if(politician.getPartyName() != null && !politician.getPartyPosition().isEmpty()){
            partyPositionValidated = true;
        }else {
            System.out.println("party position is not valid");
        }

        if(politician.getState() != null && !politician.getState().isEmpty()){
            stateValidated = true;
        }else {
            System.out.println("state is not valid");
        }
        if(politician.getCountry() != null && !politician.getCountry().isEmpty()){
            countryValidated = true;
        }else {
            System.out.println("country is not valid");
        }

        if(politicianIdValidated && nameValidated  && genderValidated  && ageValidated && partyNameValidated && partyPositionValidated  && stateValidated && countryValidated){
            isPoliticianValidated = true;
        }else {
            System.out.println("politician  is not valid");
        }

        return  isPoliticianValidated;

    }

}
