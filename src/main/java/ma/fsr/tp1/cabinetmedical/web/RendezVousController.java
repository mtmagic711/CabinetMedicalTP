package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.RendezVous;
import ma.fsr.tp1.cabinetmedical.service.RendezVousService;
import ma.fsr.tp1.cabinetmedical.web.DTO.RendezVousDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/rendezvous")
public class RendezVousController {
    @Autowired
    RendezVousService rendezVousService;
    @PostMapping
    public RendezVous createRDV(@RequestBody RendezVousDTO dto) {
        return rendezVousService.createRDV(dto.getPatientId(), dto.getMedecinId(), dto.getDate());
    }

    @GetMapping
    public List<RendezVous> listerRDV() {
        return rendezVousService.listerRDV();
    }
}
