package com.clearview.stationskurve.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Patient {
    @Id
    private Integer id;

    private String surname;

    private String first_name;

    private java.sql.Date date_of_birth;

    private Integer room;

    private java.sql.Timestamp admission;

    private java.sql.Timestamp dismissal;

    private boolean septic;

    private String diagnosis;

    private String symptoms;

    private Integer height;

    private Integer weight;
}
