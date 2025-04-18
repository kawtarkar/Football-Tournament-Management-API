package tp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp.entities.Equipe;
import tp.entities.Joueur;
import tp.entities.Match;
import tp.entities.Stade;

@Repository
public interface  MatchRepository extends JpaRepository<Match, Long> {
// List<Joueur> findByEquipe (Equipe e);
List<Match> findByArbitresIdArbitre(Long idArbitre);
List<Match> findByStadesIdStade(Long idStade);
List<Match> findByDateMatch(String dateMatch);
Stade findStadeByIdMatch(Long idMatch);
}
