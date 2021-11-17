/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_michelland_peron;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class Partie {
    Joueur Listejoueurs[] = new Joueur[2];
    Joueur JoueurCourant;
    Grille grilleDeJeu = new Grille();
    
public void attribuerCouleursAuxJoueurs() {
    Random rand = new Random(2);
    int r = rand.nextInt(2);
    if (r==0){
        Listejoueurs[0].couleur = "Rouge";
        Listejoueurs[1].couleur = "Jaune";
    } 
    else {
        Listejoueurs[0].couleur = "Jaune";
        Listejoueurs[1].couleur = "Rouge";
    }
}
  
public void initialiserPartie() {
    grilleDeJeu.viderGrille();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Nom du joueur 1 :");
    Joueur Joueur1 = new Joueur(sc.nextLine());
    
    System.out.print("Nom du joueur 2 :");
    Joueur Joueur2 = new Joueur(sc.nextLine());
    
    Listejoueurs[1] = Joueur2;
    Listejoueurs[0] = Joueur1;

    for (int i = 0; i < 21; i++) {
        Jeton J1 = new Jeton(Listejoueurs[0].couleur);
        Joueur1.ajouterjeton(J1);
        Jeton J2 = new Jeton(Listejoueurs[0].couleur);
        Joueur2.ajouterjeton(J2);
    }

    
}    
public void debuterPartie() {
    
}
        
}
