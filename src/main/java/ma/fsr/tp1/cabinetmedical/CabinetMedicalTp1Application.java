package ma.fsr.tp1.cabinetmedical;

import ma.fsr.tp1.cabinetmedical.model.Medecin;
import ma.fsr.tp1.cabinetmedical.repository.MedecinRepository;
import ma.fsr.tp1.cabinetmedical.repository.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabinetMedicalTp1Application {
	@Autowired
	RendezVousRepository rendezVousRepository;
	@Autowired
	MedecinRepository medecinRepository;

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedicalTp1Application.class, args);
	}

}
