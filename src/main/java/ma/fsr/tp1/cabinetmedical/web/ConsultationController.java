package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.Consultation;
import ma.fsr.tp1.cabinetmedical.service.ConsultationService;
import ma.fsr.tp1.cabinetmedical.web.DTO.ConsultationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {
    @Autowired
    ConsultationService consultationService;
    @PostMapping
    public Consultation createConultation(@RequestBody ConsultationDTO cdto) {
        return consultationService.createConsult(cdto.getRendezVousId(), cdto.getDate(), cdto.getRapport());
    }

    @GetMapping
    public List<Consultation> listerConsultation() {
        return consultationService.listerConsultation();
    }
}
