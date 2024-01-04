package com.clearview.stationskurve.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    // @Responsebody: returned value is the response, not a view name
    @PostMapping(path="/addPatient")
    @ResponseBody
    public String addPatient(@RequestParam Integer id){
        return patientService.addPatient(id);
    }

    @GetMapping(path="/allPatients")
    @ResponseBody
    public Iterable<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping(path="/patientById")
    @ResponseBody
    public Patient getPatientById(@RequestParam Integer id){
        return patientService.getPatientForId(id);
    }

    @GetMapping(path="/septic")
    @ResponseBody
    public Iterable<Patient> getSepticPatients(){
        return patientService.getSepticPatients();
    }

    @GetMapping(path="/populatePatientTable")
    public String getPatientTableAsString(Model model){
        Iterable<Patient> allP = patientService.getAllPatients();
        model.addAttribute("patients", allP);
        return "patientsTable";
    }
}
