package tp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import tp.entities.Equipe;
import tp.entities.Joueur;
@Repository

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
	 List<Equipe> findByPays(String pays);

}
