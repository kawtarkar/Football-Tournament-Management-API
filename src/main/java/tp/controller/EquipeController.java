package tp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import tp.dao.EquipeRepository;
import tp.dao.JoueurRepository;
import tp.entities.Equipe;
import tp.entities.Joueur;


@RestController
public class EquipeController {
	
	@Autowired
	EquipeRepository er;
	@Autowired
	JoueurRepository jr;
	
	@GetMapping("equipe")
	public List<Equipe> getAllEquipes()  {
		return er.findAll();
		
	}
	@PostMapping ("equipe")
	public Equipe addEquipe ( @RequestBody Equipe e) {
		return er.save(e);
	}
	
	@GetMapping("equipe/{id}")
	public Equipe getEquipeById ( @PathVariable Long id) {
		return er.findById(id).get();
	}
	
	@DeleteMapping("equipe/{id}")
	public void deleteEquipe(@PathVariable Long id) {
	er.deleteById(id);
	}
	@PutMapping ("equipe")
	public Equipe updateEquipe (@RequestBody Equipe e) {
		return er.save(e);
	}
	/*@PostMapping ("equipe/{id}/joueur")
	public Joueur AddJoueurToEquipe (@PathVariable Long id ,@RequestBody Joueur j ){
		Equipe e=er.findById(id).get();
		j.setEquipe(e);
		return jr.save(j);
	}
*/
	@GetMapping("equipe/{id}/joueur")
	public List<Joueur> equipeById(@PathVariable Long id) {
	return jr.findByEquipeIdEquipe(id);
	}
	@GetMapping("equipe/pays/{pays}")
	public List<Equipe> getAllEquipesFromMaroc(@PathVariable String pays) {
        return er.findByPays(pays);
    }
	
	
	/*@GetMapping("equipe/{id}/joueur")
	//public List<Joueur> getJoueurByEquipeId (Long idEquipe){
	//	Equipe e=er.findById(idEquipe).get();
		//return jr.findByEquipe(e);
		
	}
*/	
	
/*	@DeleteMapping ("Equipe/{id}/joueur")
	public void deleteEquipe(@PathVariable Long id) {
		List<Joueur> joueurs =  getJoueurByEquipeId (id);
		joueurs.forEach(s->{
			s.setEquipe(null);
		});
		er.deleteById(id);
	}
	
*/	
	
	

	
	
	
}
