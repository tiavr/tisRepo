/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo3;

import exo3.*;

/**
 *
 * @author tiavr
 */
public class CompteBancaire {
    private int numero;
    private String client;
    private double solde;
    private double dA;
    
    public CompteBancaire(){
        numero = 0;
        client = "John Doe";
        solde = 0;
        dA = 0;
                
    }
    public CompteBancaire(int numero, String nom){
        this.numero = numero;
        this.client = nom;
        solde = 100;
        dA = 50;
    }
    
    public CompteBancaire(int numero, String nom, double somme){
        this.numero = numero;
        this.client = nom;
        this.solde = somme;
        dA = (somme / 2) *(-1);
    }
    
    public void depot(double somme){
        if(somme > 0){
            solde = getSolde() + somme;
        }
    }
    
    public boolean retrait(double somme){
          if (somme > getSolde()){
              if((getSolde() - somme) * (-1) <= getdA()){
                  return false;
              }
              else{
                  solde = getSolde() - somme;
                  return true;
              }
          }
          else{
              solde = getSolde() - somme;
              return true;
          }
    }
    
    public boolean estADecouvert(){
        if (getSolde() < 0){
            return true;
        }
        return false;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return the client
     */
    public String getClient() {
        return client;
    }

    /**
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }
    
    public String infos(){
        String s;
        if(getSolde() < 0){
            s = "-----------------------------------------\n" +
                    "Client : " + client + "\n" +
                    "   Numéro du compte: " + numero + "\n" +
                    "   Solde débiteur  : " + solde + "\n" +
                    "----------------------------------------";
        }
        else{
            s = "-----------------------------------------\n" +
                    "Client : " + client + "\n" +
                    "   Numéro du compte: " + numero + "\n" +
                    "   Solde créditeur  : " + solde + "\n" +
                    "----------------------------------------";
        }
        return s;
    }

    /**
     * @return the dA
     */
    public double getdA() {
        return dA;
    }
}

