/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comerç_fisic_autoservei;

/**
 *
 * @author lluis_000
 */
public class Empleat {
    private String nom;
    private String cognoms;
    private double sou;
       
    @Override
    public String toString(){
        return this.nom;
    }
    public Empleat(String nom){
        this.nom=nom;
    }
    
}
