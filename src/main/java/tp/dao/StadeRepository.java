package tp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp.entities.Equipe;
import tp.entities.Joueur;
import tp.entities.Match;
import tp.entities.Stade;

@Repository
public interface  StadeRepository extends JpaRepository<Stade, Long> {
/* List<Joueur> findByEquipe (Equipe e);
List<Joueur> findByEquipeId(Long idEquipe);
*/
}
