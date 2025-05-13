package HomeWorks;

import java.util.*;

/*
    Esercizio #1
Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti
 il numero di elementi da inserire e poi gli chieda di inserire N parole.
Il programma dovrà:
– stampare tutte le parole duplicate
– stampare il numero di parole distinte
– stampare l'elenco delle parole distinte
Utilizzare l'interfaccia Set e l'implementazione HashSet

     */
public class Es1 {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Quante parole vuoi inserire?");

            int paroleDaInserire= scanner.nextInt();

            scanner.nextLine();
            // Array di codici Unicode per i numeri cerchiati
            String[] numeriCerchiati = {"①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩"};

            // array per inserire a ogni iterazione del ciclo la stringa passata
            List <String> arrayDiParoleUtente= new ArrayList<>();

            for (int i = 0; i < paroleDaInserire; i++) {
                System.out.println("Inserisci la " +numeriCerchiati[i]+ " parola ");
                String parolaUtente=scanner.nextLine();
                arrayDiParoleUtente.add(parolaUtente);
           }

            // uso hashset in quanto non accetta i duplicati ed i duplicato li vado ad aggiungere in una lista
            //cosi se ripeto piu volte la stessa parola la lista avrà la grandezza e mostrerà il numero di parole
            Set<String> paroleDistinte= new HashSet<>();
            List<String> paroleDuplicate= new ArrayList<>();
            for (String s : arrayDiParoleUtente) {
                if (!paroleDistinte.add(s)){
                    paroleDuplicate.add(s);
                }


            }


            System.out.println("Le parole diplicate sono " + paroleDuplicate.size()+" e sono le seguenti " +paroleDuplicate );
            System.out.println("Il numero di parole distinte è "+paroleDistinte.size());
            System.out.println("Le parole distinte sono"+paroleDistinte);




        }
}
