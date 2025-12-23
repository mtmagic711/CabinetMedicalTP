package ma.fsr.tp1.cabinetmedical.web.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RendezVousDTO {

    private Long patientId;
    private Long medecinId;
    private LocalDate date;
}
