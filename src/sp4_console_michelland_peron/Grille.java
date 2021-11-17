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
    for (int i=0;i<=5;i++){
        for (int j=0;j<=6;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
}


public boolean ajouterJetonDansColonne(Jeton Jeton, int nC){
    
    for (int i=0; i<7;i++){
        if (CellulesJeu[i][nC].jetonCourant==null){
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
    int i;
    int j;  
    for (i=5; i>=0;i--){
        for (j=6; j>=0;j--){
            if (CellulesJeu[i][j].lireCouleurDuJeton()=="rouge"){
                System.out.println("\033[31m O");
            }
            else {
                System.out.println("\\033[33m O");
            }
        }
    }
}

public String lireCouleurDuJeton(int nL,int nC ){
    return CellulesJeu[nC][nL].lireCouleurDuJeton();

}

public boolean celluleOccupee(int nL,int nC){
    if (CellulesJeu[nC][nL]!=null){
        return true;
    }
    return false;
}

public boolean etreGagnantePourJoueur(Joueur Joueur1){
    for (int i=0; i<6;i++){
        for (int j=0; j<4;j++){ // le if en dessous verifie si il y a une ligne de quatre jetons de la meme couleur. 
            if (CellulesJeu[i][j].lireCouleurDuJeton()!=null && CellulesJeu[i][j].lireCouleurDuJeton().equals(Joueur1.couleur)){
                if (CellulesJeu[i][j+1].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i][j+2].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i][j+3].lireCouleurDuJeton().equals(Joueur1.couleur)){
                    return true;
                }
    
            }
                
        }
    }
    for (int i=0;i<3;i++){
       for (int j=0; j<4;j++){// ICI C'est pour verifier diagonale vers la droite motante
            if (CellulesJeu[i][j].lireCouleurDuJeton()!=null && CellulesJeu[i][j].lireCouleurDuJeton().equals(Joueur1.couleur)){
                if (CellulesJeu[i+1][j+1].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i+2][j+2].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i+3][j+3].lireCouleurDuJeton().equals(Joueur1.couleur)){
                    return true; 
                }
            }
        }
    }
    for (int i=0;i<2;i++){ // Verifie la colonne 
       for (int j=0; j<6;j++){
            if (CellulesJeu[i][j].lireCouleurDuJeton()!=null && CellulesJeu[i][j].lireCouleurDuJeton().equals(Joueur1.couleur)){
                if (CellulesJeu[i+1][j].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i+2][j].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i+3][j].lireCouleurDuJeton().equals(Joueur1.couleur)){
                    return true; 
                }
            }
        }
    }
    for (int i=0;i<3;i++){
       for (int j=0; j<4;j++){// ICI C'est pour verifier diagonale vers la droite descendante.
            if (CellulesJeu[i][j].lireCouleurDuJeton()!=null && CellulesJeu[i][j].lireCouleurDuJeton().equals(Joueur1.couleur)){
                if (CellulesJeu[i-1][j+1].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i-2][j+2].lireCouleurDuJeton().equals(Joueur1.couleur) &&CellulesJeu[i-3][j+3].lireCouleurDuJeton().equals(Joueur1.couleur)){
                    return true; 
                }
            }
        }
    }
    return false;
   
}
}
/*
public void tasserGrille(int){
}
public boolean colonneRemplie(int){
}
public boolean placerDesintegrateur(int,int){
}
public boolean placerTrouNoir(int,int){
}
public boolean supprimerJeton(int,int){
}
*/



