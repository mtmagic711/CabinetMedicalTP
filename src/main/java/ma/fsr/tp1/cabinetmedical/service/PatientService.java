package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Patient;
import ma.fsr.tp1.cabinetmedical.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    public Patient create(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> listerPatients() {
        return patientRepository.findAll();
    }

    public String deletePatient (Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElse(null);
        if (patient != null) {
            patientRepository.delete(patient);
            return "Patient a ete supprime";
        }
        else
            return "Patient n'existe pas";
    }
}
