package com.fekri.joueurs;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.service.JoueurService;

@SpringBootApplication
public class JoueursApplication implements CommandLineRunner {

	@Autowired 
	JoueurService joueurService;
	
	public static void main(String[] args) {
		SpringApplication.run(JoueursApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		joueurService.saveJoueur(new Joueur("fekri","Bouallegue" , new Date(),"attaquant",22));
		joueurService.saveJoueur(new Joueur("ibrahim","Bouallegue" , new Date(),"attaquant",22));
		joueurService.saveJoueur(new Joueur("saif","Bouallegue" , new Date(),"attaquant",25));


		
	}

}
