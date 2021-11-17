/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_michelland_peron;

/**
 *
 * @author miche
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;

public Cellule(){
    jetonCourant=null;
    trouNoir=false;
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
