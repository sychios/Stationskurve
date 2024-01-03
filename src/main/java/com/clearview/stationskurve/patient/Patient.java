package com.clearview.stationskurve.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Patient {
    @Setter
    @Id
    private Integer id;

    @Setter
    private String name;

    @Setter
    private String vorname;

    @Setter
    private java.sql.Date geburtstag;

    @Setter
    private Integer zimmer;

    @Setter
    private java.sql.Timestamp aufnahme;

    @Setter
    private boolean septisch;
}
