package it.viligiardi;

public class Cavallo extends Thread{
    //attributes
    private int numC; //numero del cavallo
    private int metri; //metri percorsi
    private Classifica c;

    //methods and constructors
    public Cavallo (int num, int m, Classifica cs){
        this.numC = num;
        this.metri = m;
        this.c = cs;
    }

    public void run(){
        int v = 0;
        while(v != metri){
            v++;
        }
        c.aggiungiCavallo(numC);
        System.out.println("Il cavallo " + numC + " ha finito");

    }
    
}
