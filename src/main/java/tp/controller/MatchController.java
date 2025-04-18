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
import tp.entities.Equipe;
import tp.entities.Match;
import tp.entities.Stade;

@RestController
public class MatchController {
	@Autowired
	MatchRepository mr;
	
	@GetMapping ("match")
	public List<Match> getAllmatchs()  {
		return mr.findAll();
		
	}
	@PostMapping ("match")
	public Match addMatch (@RequestBody Match m) {
		return mr.save(m);
	}
	
	@DeleteMapping ("match/{id}")
	public void deleteMatch (@PathVariable Long id) {
		mr.deleteById(id);
	}
	@PutMapping ("match")
	public Match updatematch (@RequestBody Match m) {
		return mr.save(m);
	}
	@GetMapping("match/dateMatch/{dateMatch}")
	public List<Match> getAllEquipesFromMaroc(@PathVariable String dateMatch) {
        return mr.findByDateMatch(dateMatch);
    }
	@GetMapping("/match/{id}/stades")
    public Stade getStadeByMatchId(@PathVariable Long id) {
        return mr.findStadeByIdMatch(id);
    }
	
}
