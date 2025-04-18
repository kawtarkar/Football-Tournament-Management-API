package tp.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
@Id

Long idEquipe;
String nomEquipe;
String pays;
@OneToMany (mappedBy = "equipe")
@JsonIgnore
List<Joueur> joueurs;

@ManyToMany(mappedBy = "equipes")
List<Match> matches;
}
