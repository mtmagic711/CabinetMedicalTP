package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.model.Patient;
import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.repository.MedecinRepository;
import ma.fsr.tp1.cabinetmedical.repository.PatientRepository;
import ma.fsr.tp1.cabinetmedical.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class RendezVousService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    RendezVousRepository rendezVousRepository;

    public RendezVous createRDV(Long patientId, Long medecinId, LocalDate date) {
        Patient patient = patientRepository.findById(patientId).orElse(null);
        Medecin medecin = medecinRepository.findById(medecinId).orElse(null);

        if (patient == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient n'existe pas");
        }
        if (medecin == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Medecin n'existe pas");
        }
        RendezVous rendezVous = new RendezVous();
        rendezVous.setStatut("PLANIFI");
        rendezVous.setPatient(patient);
        rendezVous.setMedecin(medecin);
        rendezVous.setDateRdv(date);

        return rendezVousRepository.save(rendezVous);
    }

    public List<RendezVous> listerRDV() {
        return rendezVousRepository.findAll();
    }
}
