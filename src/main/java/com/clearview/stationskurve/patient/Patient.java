package com.clearview.stationskurve.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    private Integer id;

    private String name;

    private String vorname;

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getVorname(){
        return this.vorname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }
}
