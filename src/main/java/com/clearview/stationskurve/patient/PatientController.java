package com.clearview.stationskurve.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    // @Responsebody: returned value is the response, not a view name
    @PostMapping(path="/addPatient")
    public @ResponseBody String addPatient(@RequestParam Integer id){
        return patientService.addPatient(id);
    }

    @GetMapping(path="/allPatients")
    public @ResponseBody Iterable<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping(path="/patientById")
    public @ResponseBody Patient getPatientById(@RequestParam Integer id){
        return patientService.getPatientForId(id);
    }

    @GetMapping(path="/septic")
    public @ResponseBody Iterable<Patient> getSepticPatients(){
        return patientService.getSepticPatients();
    }
}
