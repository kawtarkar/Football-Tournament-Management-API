package tp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tp.entities.Equipe;
import tp.entities.Joueur;

@Repository
public interface  JoueurRepository extends JpaRepository<Joueur, Long> {
//List<Joueur> findByEquipe (Equipe e);
List<Joueur>findByEquipeIdEquipe(Long idEquipe);

}
