package tp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tp.dao.EquipeRepository;
import tp.dao.JoueurRepository;
import tp.entities.Equipe;
import tp.entities.Joueur;
/*
@Service
public class GroupeServices {
	
	@Autowired
	EquipeRepository gr;
	@Autowired
	JoueurRepository sr;
	
	
	public List<Equipe> getAllGroupes()  {
		return gr.findAll();
		
	}
	
	public Equipe addGroupe ( Equipe g) {
		
		return gr.save(g);
	}
	
	
	public Equipe getGroupeById ( Long id) {
		return gr.findById(id).get();
	}
	public List<Joueur> getStudentByGroupeId ( Long id){
		Equipe g=gr.findById(id).get();
		return sr.findByGroupe(g);
		
	}
	
	
	public Joueur AddStudentToGroupe ( Long id ,Joueur s ){
		Equipe g=gr.findById(id).get();
		s.setGroupe(g);
		return sr.save(s);
		
	}
	
	public void deleteGroupe(Long id) {
		List<Joueur> joueurs =  getStudentByGroupeId (id);
		joueurs.forEach(s->{
			s.setGroupe(null);
		});
		gr.deleteById(id);
	}

}
*/