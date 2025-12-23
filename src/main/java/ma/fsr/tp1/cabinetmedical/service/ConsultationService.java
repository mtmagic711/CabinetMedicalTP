package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Consultation;
import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.repository.ConsultationRepository;
import ma.fsr.tp1.cabinetmedical.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ConsultationService {
    @Autowired
    RendezVousRepository rendezVousRepository;
    @Autowired
    ConsultationRepository consultationRepository;

    public Consultation createConsult(Long rendezVousId, LocalDate date, String rapport) {
        RendezVous rendezVous = rendezVousRepository.findById(rendezVousId).orElse(null);
        if (rendezVous == null) {
            throw new RuntimeException("RendezVous n'existe pas!!");
        }
        Consultation consultation = new Consultation();
        consultation.setDateConsultation(date);
        consultation.setRapport(rapport);
        consultation.setRendezVous(rendezVous);

        return consultationRepository.save(consultation);
    }

    public List<Consultation> listerConsultation() {
        return consultationRepository.findAll();
    }
}
