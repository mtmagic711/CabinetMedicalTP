package ma.fsr.tp1.cabinetmedical.web.DTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ConsultationDTO {
    private Long rendezVousId;
    private LocalDate date;
    private String rapport;
}
