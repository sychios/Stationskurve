package com.clearview.stationskurve.patient;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Iterable<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    //TODO: replace id-param with meaningful parameter-object (patient-class?)
    public String addPatient(@RequestParam Integer id){
        Patient patientToAdd = new Patient();
        patientToAdd.setId(id);
        patientRepository.save(patientToAdd);
        return "Patient saved.";
    }

    public Iterable<Patient> getSepticPatients(){
        return ((List<Patient>) patientRepository.findAll())
                .stream()
                .filter(patient -> patient.isSeptic())
                .toList();
    }

    public Patient getPatientForId(@RequestParam Integer patientId){
        return patientRepository.findById(patientId).orElse(null);
    }

    public String populateSinglePatient(Model model){
        model.addAttribute("name", "Karlsson");
        model.addAttribute("vorname", "Karl");
        return "singlePatientTableRow";

    }
}
