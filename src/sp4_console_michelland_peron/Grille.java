/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_michelland_peron;

/**
 *
 * @author miche
 */
public class Grille {
    Cellule [][] CellulesJeu = new Cellule [6][7];


public void grille (){

}

public boolean ajouterJetonDansColonne(Jeton Jeton, int nbCol){
    int i;
    for (i=0; i<7;i++){
        if (CellulesJeu[nbCol][i].jetonCourant==null){
            return true;
        }
    }
    return false;
    
}

public boolean etreRemplie(){
    int i;
    int j;
    for (i=0; i<7;i++){
        for (j=0; j<6;j++){
            if (CellulesJeu[j][i]==null){
                return false;
            }
        }
    }
    return true;
}

public void viderGrille(){
    CellulesJeu= null;
}

public void afficherGrilleSurConsole(){
    
}

}