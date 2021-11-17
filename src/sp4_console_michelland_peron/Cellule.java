/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_michelland_peron;
import java.util.Random;

/**
 *
 * @author miche
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trounoir;
    boolean desintegrateur;
    private Object[][] CellulesJeu;

public Cellule(){
    jetonCourant=null;
    trounoir=false;
    desintegrateur=false;
}
    
public boolean affecterJeton (Jeton jeton1){
    if (jetonCourant==null){
        jetonCourant=jeton1;
        return true;
    }
    else {
        return false;
    }
}
public String lireCouleurDuJeton (){
    if (jetonCourant==null){
        return "rien";
    }
    else{
        return jetonCourant.couleur;
    }
    
    
}

public boolean placerTrousNoirs(){
    
    for (int i=0;i<5;i++){
        Jeton j= new Jeton("rouge");
        Random r = new Random(6);
        int x = r.nextInt();
        Random ra= new Random(7);
        int y = ra.nextInt();
        CellulesJeu[x][y].ajouterJetonDansColonne(j)="Noir";
    }
   Jeton j= new Jeton("rouge");
        String c=j.lireCouleur();
        System.out.println(c);
        
        Cellule cell= new Cellule();
        c=cell.lireCouleurDuJeton();
        System.out.println(c);
        boolean d=cell.affecterJeton(j);
        System.out.println(d);

   
}
/*
public boolean supprimeJeton (){
    jetonCourant=null;
        return false;
}

public boolean placerTrouNoir(){
    if (trouNoir==false){
        trouNoir=true;
        return true;
    }
    else {
        return false;
    }
}

public boolean presenceTrouNoir (){
    if (trouNoir==true){
        return true;
    }
}


*/
}

