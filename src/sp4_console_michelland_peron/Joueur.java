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
        Jeton [] listeJetons=new Jeton [21];

public Joueur(String lenom) {
    nom = lenom;
}

public void AffecterCouleur (String lacouleur) {
    couleur = lacouleur;
}

public boolean ajouterjeton (Jeton J){
    if (nombreJetonsRestants<21){
        listeJetons[nombreJetonsRestants]=J;/*on assigne un jeton dans la liste. */
        nombreJetonsRestants=nombreJetonsRestants +1;/*on actualise la valeur du nombre de jetons restants. */
        return true;  
    }
    else {      
        return false; /*il n'y a plus de place dans la liste de jetons pour en ajouter. */
    }
}
}

