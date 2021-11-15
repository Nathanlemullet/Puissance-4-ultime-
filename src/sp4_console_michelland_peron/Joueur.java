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
        int nombreJetonsRestants ;
        int [] listeJetons=new int [21];
public Joueur(String lenom) {

    nom = lenom; 
}
public void AffecterCouleur (String lacouleur) {

    couleur = lacouleur; 
}
public boolean ajouterjeton (int lesJetons){
    if (nombreJetonsRestants<21){
        listeJetons[nombreJetonsRestants]=lesJetons;
        return true;
    }
    else {
        return false;
    }
}
}

