package tp.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="`Match`")
public class Match {

@Id
long idMatch;
String dateMatch;
String heurMatch;


@ManyToMany
List<Equipe> equipes;
@ManyToOne
@JoinColumn(name = "id_stade")
Stade stades;
@ManyToOne
@JoinColumn(name = "id_arbitre")
Arbitre arbitres;

}
