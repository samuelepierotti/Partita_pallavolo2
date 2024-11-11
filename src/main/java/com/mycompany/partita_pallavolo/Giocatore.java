package com.mycompany.partita_pallavolo;

public class Giocatore implements Runnable {
    private int idGiocatore;
    private int numeroPassaggi;
    private int priorita;

    public Giocatore(int idGiocatore, int priorita) {
        this.idGiocatore = idGiocatore;
        this.priorita = priorita;
        this.numeroPassaggi = 0;
    }

    public int getIdGiocatore() {
        return idGiocatore;
    }

    public int getPriorita() {
        return priorita;
    }

    @Override
    public void run() {
        // Comunica i dati del giocatore all'inizio della partita
        System.out.println("Giocatore " + idGiocatore + ", con priorità: " + Thread.currentThread().getPriority());

        // Inizio del ciclo di gioco
        while (true) {
            numeroPassaggi++;
            System.out.println("Giocatore " + idGiocatore + " Numero passaggi: " + numeroPassaggi);
            
            // Simulazione del passaggio con yield
            Thread.yield();
        }
    }
}