package it.viligiardi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Classifica cl = new Classifica();
        int l = 30;
        Cavallo c1 = new Cavallo(1, l, cl);
        Cavallo c2 = new Cavallo(2, l, cl);
        Cavallo c3 = new Cavallo(3, l, cl);
        Cavallo c4 = new Cavallo(4, l, cl);
        Cavallo c5 = new Cavallo(5, l, cl);
        Cavallo c6 = new Cavallo(6, l, cl);
        Cavallo c7 = new Cavallo(7, l, cl);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();
        c6.join();
        c7.join();

        System.out.println("La classifica finale è :");
        cl.stampaClassifica();
    }
}