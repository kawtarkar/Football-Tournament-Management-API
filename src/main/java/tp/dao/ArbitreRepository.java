package tp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp.entities.Arbitre;
import tp.entities.Equipe;
import tp.entities.Joueur;
import tp.entities.Match;
import tp.entities.Stade;

@Repository
public interface  ArbitreRepository extends JpaRepository<Arbitre, Long> {
/* List<Joueur> findByEquipe (Equipe e);
List<Joueur> findByEquipeId(Long idEquipe);
*/
}
