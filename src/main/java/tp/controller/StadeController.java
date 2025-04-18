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
import tp.dao.StadeRepository;
import tp.entities.Arbitre;
import tp.entities.Match;
import tp.entities.Stade;

@RestController
public class StadeController {
	@Autowired
	StadeRepository sr;
	@Autowired
	MatchRepository mr;
	@GetMapping ("stade")
	public List<Stade> getAllStades()  {
		return sr.findAll();
		
	}
	@PostMapping ("stade")
	public Stade addStade (@RequestBody Stade s) {
		return sr.save(s);
	}
	
	@DeleteMapping ("stade/{id}")
	public void deleteStade (@PathVariable Long id) {
		sr.deleteById(id);
	}
	@PutMapping ("stade")
	public Stade updatematch (@RequestBody Stade s) {
		return sr.save(s);
	}
	@PostMapping ("stade/{idStade}/match")
	public Match AddMatchToStade (@PathVariable Long idStade ,@RequestBody Match m ){
		Stade s=sr.findById(idStade).get();
		m.setStades(s);
		return mr.save(m);
	}
	
	@GetMapping("stade/{idStade}/match")
	public List<Match> stadeById(@PathVariable Long idStade) {
	return mr.findByStadesIdStade(idStade);
	}
	
	
}
