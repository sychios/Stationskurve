package com.clearview.stationskurve.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(path="/allPatients")
    public @ResponseBody Iterable<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
}
