package com.fekri.joueurs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.repos.JoueurRepository;
import com.fekri.joueurs.service.JoueurService;

@SpringBootTest
class JoueursApplicationTests {
	@Autowired
	private JoueurRepository joueurRepository;
	private JoueurService Joueurservice;

	@Test
	public void testCreateJoueur() {
	Joueur jou = new Joueur("ahmed","bouallegue",new Date(),"attaquant",25);
	joueurRepository.save(jou);
	}
	@Test
	public void testFindJoueur()
	{
	Joueur jou = joueurRepository.findById(4L).get();
	System.out.println(jou);
	}
	@Test
	public void testUpdateJoueur()
	{
	Joueur jou = joueurRepository.findById(4L).get();
	jou.setAge(35);
	joueurRepository.save(jou);
	}
	@Test
	public void testDeleteJoueur() {
		{
			joueurRepository.deleteById(4L);
			}

		
	}
	@Test
	public void testListerTousjoueurs()
	{
	List<Joueur> jous = joueurRepository.findAll();
	for (Joueur p : jous)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomJoueurContains()
	{
	Page<Joueur> joues = Joueurservice.getAlljoueursParPage(0,2);
	System.out.println(joues.getSize());
	System.out.println(joues.getTotalElements());
	System.out.println(joues.getTotalPages());
	joues.getContent().forEach(p -> {System.out.println(p.toString());
	 });

	}
}


	


