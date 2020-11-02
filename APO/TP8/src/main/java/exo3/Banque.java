/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

/**
 *
 * @author tiavr
 */
public class Banque {
    private String nom;
    private CompteBancaire[] tab;
    
    public Banque(){
        CompteBancaire c1 = new CompteBancaire(2350, "toto", 100);
        CompteBancaire c2 = new CompteBancaire(2351, "tata", 550);
        CompteBancaire c3 = new CompteBancaire(2352, "titi", 1550);
        CompteBancaire c4 = new CompteBancaire(2353, "foo", 2895);
        CompteBancaire c5 = new CompteBancaire(2354, "bar", 256);
        nom = "APO BANK";
        tab = new CompteBancaire[5];
        tab[0] = c1;
        tab[1] = c2;
        tab[2] = c3;
        tab[3] = c4;
        tab[4] = c5;
       
    }
    
    public String versChaineDeCaracteres(){
        String s = "";
        for(CompteBancaire value : tab){
             s = s + value.infos();
        }
        return s;
    }
    
    public double avoirTotal(){
        double somme = 0;
        for(CompteBancaire value : tab){
            somme += value.getSolde();
        }
        return somme;
    }
    
    public void afficheDebit(){
        for(CompteBancaire value : tab){
            if(value.getSolde() < 0){
                System.out.println(value.infos());
            }
        }
    }
    
    public CompteBancaire getClient(int indice){
        if(indice < 0 && indice > tab.length){
            return null;
        }
        else{
            return tab[indice];
        }
    }
    
    public void  afficheNumeroDebitPlancher(){
        for(CompteBancaire value : tab){
            if(value.getSolde() == value.getdA()){
                System.out.println("affiche numero cmpte debit plancher :" + value.getNumero());
            }
        }
    }
}
