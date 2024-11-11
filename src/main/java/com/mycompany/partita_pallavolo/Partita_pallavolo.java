package com.mycompany.partita_pallavolo;

public class Partita_pallavolo {

    public static void main(String[] args) {
        // Creazione del primo giocatore con massima priorità
        Giocatore g1 = new Giocatore(1, Thread.MAX_PRIORITY);
        Thread t1 = new Thread(g1);
        t1.setPriority(Thread.MAX_PRIORITY); // Imposta massima priorità
        System.out.println("Giocatore " + g1.getIdGiocatore() + ", Priorità: " + t1.getPriority() + ", Nome Thread: " + t1.getName());
        t1.start();

        // Creazione del secondo giocatore con priorità normale
        Giocatore g2 = new Giocatore(2, Thread.NORM_PRIORITY);
        Thread t2 = new Thread(g2);
        t2.setPriority(Thread.NORM_PRIORITY); // Imposta priorità normale
        System.out.println("Giocatore " + g2.getIdGiocatore() + ", Priorità: " + t2.getPriority() + ", Nome Thread: " + t2.getName());
        t2.start();
    }
}