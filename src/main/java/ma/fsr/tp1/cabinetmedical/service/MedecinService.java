package ma.fsr.tp1.cabinetmedical.service;

import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinService {
    @Autowired
    MedecinRepository medecinRepository;

    public Medecin createMedecin (Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    public List<Medecin> listerMedecin() {
        return medecinRepository.findAll();
    }

    public String deleteMedecin(Long medecinId) {
        Medecin medecin = medecinRepository.findById(medecinId).orElse(null);
        if (medecin != null){
            medecinRepository.delete(medecin);
            return "Medecin a ete supprime";
        }
        else
            return "Medecin n'existe Pas";

    }
}
