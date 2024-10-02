package it.viligiardi;

import java.util.ArrayList;

public class Classifica {
    //attributes
    ArrayList<Integer> lc = new ArrayList<>();
    
    //methods and constructors
    public Classifica(){
    }

    synchronized public void aggiungiCavallo(int i){
        lc.add(i);
    }

    public void stampaClassifica(){
        for (int i : lc) {
            System.out.println(i);
        }
    }
}
