package ma.fsr.tp1.cabinetmedical.web;

import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Medecins")
public class MedecinController {
    @Autowired
    MedecinService medecinService;
    @PostMapping
    public Medecin createMedecin(@RequestBody Medecin medecin) {
        return medecinService.createMedecin(medecin);
    }

    @GetMapping
    public List<Medecin> listerMedecin() {
        return medecinService.listerMedecin();
    }
    @DeleteMapping("/{medecinId}")
    public String deleteMedecin(@PathVariable Long medecinId) {
        return medecinService.deleteMedecin(medecinId);
    }
}
