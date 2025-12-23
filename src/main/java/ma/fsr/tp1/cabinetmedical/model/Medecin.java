package ma.fsr.tp1.cabinetmedical.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Medecin {
    @Id
    @GeneratedValue
    long id;
    String nom;
    String specialite;
    String email;
}
