package com.fekri.joueurs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fekri.joueurs.entities.Joueur;

public interface JoueurService {
Joueur saveJoueur(Joueur p);
List<Joueur> getAlljoueurs();
void deleteJoueur(Joueur p);
void deleteJoueurById(Long id);
Joueur getJoueur(Long id);
Joueur updateJoueur(Joueur p);
Page<Joueur> getAlljoueursParPage(int page, int size);








}

