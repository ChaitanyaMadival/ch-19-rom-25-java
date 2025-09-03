package com.appolo.hospitalapp.patient;



//lombok - api

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
}
