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

    private String name;

    private String vorname;

    private java.sql.Date geburtstag;

    private Integer zimmer;

    private java.sql.Timestamp aufnahme;

    private boolean septisch;
}
