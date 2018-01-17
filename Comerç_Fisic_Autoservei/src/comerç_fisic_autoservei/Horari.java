/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comerç_fisic_autoservei;

import java.util.ArrayList;

/**
 *
 * @author lluis_000
 */
public class Horari {
    ArrayList <Pair <Data, Data> > FranjaesHoraries;
    
        /**
    @pre --
    @post --
    @brief Constructor per defecte
    */
    public Horari(){
        this.FranjaesHoraries=new ArrayList<Pair <Data, Data> >();
    }
    public void inserirFranja(Data a ,Data b){
        Pair<Data, Data> data = new Pair<>(a, b);
        FranjaesHoraries.add(data);//s'hauria de fer que inseris de forma ordenada
    }
}
