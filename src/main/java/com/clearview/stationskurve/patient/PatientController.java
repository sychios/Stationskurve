package com.clearview.stationskurve.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping(path="/allPatients")
    public @ResponseBody Iterable<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @GetMapping(path="/firstPatient")
    public @ResponseBody Patient getFirstPatient(){
        return patientRepository.findAll().iterator().next();
    }

    @PostMapping(path="/patientById")
    public @ResponseBody Patient getPatientById(@RequestParam Integer id){
        return patientRepository.findById(id).orElse(null);
    }

    @GetMapping(path="/septic")
    public @ResponseBody Iterable<Patient> getSepticPatients(){
        return ((List<Patient>) patientRepository.findAll())
                .stream()
                .filter(patient -> patient.isSeptisch())
                .toList();
    }
}
