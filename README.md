# Partita di pallavolo

## Scopo del Progetto

Il progetto simula una partita di pallavolo in cui due giocatori eseguono un passaggio virtuale l'uno all'altro utilizzando il multithreading in Java. Ogni giocatore è rappresentato da un thread e comunica il proprio ID, priorità e numero di passaggi. La simulazione utilizza il metodo `yield()` per simulare il passaggio della "palla" tra i giocatori, consentendo al thread attuale di cedere l'esecuzione ad altri thread.

## Classe `Giocatore`

### Attributi
- **idGiocatore**: Identifica univocamente il giocatore.
- **numeroPassaggi**: Contatore che tiene traccia del numero di passaggi effettuati dal giocatore.
- **priorita**: Indica la priorità del giocatore (utilizzata per definire la priorità del thread associato).

### Metodi
- **getIdGiocatore()**: Restituisce l'ID del giocatore.
- **getPriorita()**: Restituisce la priorità del giocatore.
- **run()**: Implementa la logica del gioco. Ogni volta che un giocatore "passa la palla", viene incrementato il contatore `numeroPassaggi`. Il thread corrente esegue poi il metodo `yield()` per cedere il controllo dell'esecuzione.

## Classe `Partita_pallavolo`

### Descrizione
La classe `Partita_pallavolo` contiene il metodo `main()`, che è il punto di partenza del programma. Qui vengono creati due oggetti di tipo `Giocatore`, associati a due thread distinti con priorità diverse. I thread vengono avviati e i giocatori iniziano la partita comunicando i loro dati e passando la palla virtualmente utilizzando il metodo `yield()`.

## Metodi e Attributi della Classe `Thread`

Nella simulazione, sono stati utilizzati i seguenti metodi e attributi della classe `Thread`:

- **setPriority(int newPriority)**: Imposta la priorità del thread. La priorità influenza l'ordine in cui i thread ottengono il controllo della CPU. In questo progetto, uno dei giocatori ha la massima priorità (`Thread.MAX_PRIORITY`) e l'altro ha la priorità normale (`Thread.NORM_PRIORITY`).
  
- **getPriority()**: Restituisce la priorità del thread. Questo metodo è utilizzato per mostrare la priorità del giocatore durante la partita.

- **getName()**: Restituisce il nome del thread corrente. Utilizzato per visualizzare il nome del thread associato a ciascun giocatore.

- **yield()**: Questo metodo statico fa sì che il thread corrente ceda l'esecuzione, consentendo ad altri thread di essere eseguiti. È utilizzato per simulare il passaggio della palla tra i giocatori.

## Metodi e Attributi della Classe `Object`

In questo progetto, non sono stati utilizzati metodi della classe `Object`, poiché la logica della simulazione si basa principalmente sulla gestione dei thread tramite la classe `Thread`.

## Commento sull'Esecuzione

Durante l'esecuzione del programma, vengono creati due thread che rappresentano i giocatori. Ogni giocatore inizia comunicando il proprio ID, priorità e numero di passaggi. Poiché i thread hanno priorità diverse, il giocatore con la priorità più alta (MAX_PRIORITY) tende a ricevere maggiore tempo di esecuzione rispetto all'altro. Tuttavia, grazie all'utilizzo del metodo `yield()`, l'esecuzione passa periodicamente all'altro giocatore, simulando efficacemente il passaggio della palla.

Esempio di output durante l'esecuzione:

```
Giocatore 1, Priorità: 10, Nome Thread: Thread-0
Giocatore 1, con priorità: 10
Giocatore 2, Priorità: 5, Nome Thread: Thread-1
Giocatore 2, con priorità: 5
Giocatore 1 Numero passaggi: 1
Giocatore 2 Numero passaggi: 1
Giocatore 1 Numero passaggi: 2
Giocatore 2 Numero passaggi: 2
...
```

L'output mostra che i passaggi avvengono in modo alternato grazie al metodo `yield()`.
