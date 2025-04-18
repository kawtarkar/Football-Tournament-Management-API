package tp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Joueur {

@Id
long idJoueur;
String nomJoueur;
String poste;
String photo;
@ManyToOne
Equipe equipe;


}
