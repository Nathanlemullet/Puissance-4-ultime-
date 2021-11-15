/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_michelland_peron;

/**
 *
 * @author miche
 */
public class Joueur {
        String nom;
        String couleur;
        int nombreDesintegrations;
        int nombreJetonsRestants=0 ;
        int [] listeJetons=new int [21];
public Joueur(String lenom) {

    nom = lenom; 
}
public void AffecterCouleur (String lacouleur) {

    couleur = lacouleur; 
}
public boolean ajouterjeton (int lesJetons){
    lesJetons=nombreJetonsRestants;
    
    if (lesJetons<21){
        listeJetons[lesJetons]=nombreJetonsRestants;/*on assigne un jeton dans la liste. */
        lesJetons=lesJetons +1;/*on actualise la valeur du nombre de jetons restants. */
        return true;   
    }
    else {
        nombreJetonsRestants=21;
        return false; /*il n'y a plus de place dans la liste de jetons pour en ajouter. */
    }
}
}

