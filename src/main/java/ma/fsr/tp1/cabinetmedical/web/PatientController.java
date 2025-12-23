package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.Patient;
import ma.fsr.tp1.cabinetmedical.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        return patientService.create(patient);
    }

    @GetMapping
    public List<Patient> patientList() {
        return patientService.listerPatients();
    }

    @DeleteMapping("/{patientId}")
    public String delete(@PathVariable Long patientId) {
        return patientService.deletePatient(patientId);
    }
}
