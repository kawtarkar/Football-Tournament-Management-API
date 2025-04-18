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

import tp.dao.MatchRepository;
import tp.dao.ArbitreRepository;
import tp.entities.Match;
import tp.entities.Arbitre;
import tp.entities.Equipe;
import tp.entities.Joueur;

@RestController
public class ArbitreController {
	@Autowired
	ArbitreRepository ar;
	@Autowired
	MatchRepository mr;
	@GetMapping ("arbitre")
	public List<Arbitre> getAllArbitres()  {
		return ar.findAll();
		
	}
	@PostMapping ("arbitre")
	public Arbitre addArbitre (@RequestBody Arbitre a) {
		return ar.save(a);
	}
	
	@DeleteMapping ("arbitre/{id}")
	public void deleteArbitre (@PathVariable Long id) {
		ar.deleteById(id);
	}
	@PutMapping ("arbitre")
	public Arbitre updateArbitre (@RequestBody Arbitre a) {
		return ar.save(a);
	}
	@PostMapping ("arbitre/{idArbitre}/match")
	public Match AddMatchToArbitre (@PathVariable Long idArbitre ,@RequestBody Match m ){
		Arbitre a=ar.findById(idArbitre).get();
		m.setArbitres(a);
		return mr.save(m);
	}
	
	@GetMapping("arbitre/{idArbitre}/match")
	public List<Match> equipeById(@PathVariable Long idArbitre) {
	return mr.findByArbitresIdArbitre(idArbitre);
	}
	
}
