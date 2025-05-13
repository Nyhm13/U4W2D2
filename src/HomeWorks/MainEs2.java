package HomeWorks;

import java.util.List;

public class MainEs2 {
    public static void main(String[] args) {

        // Esempio di utilizzo delle funzioni
        int n = 10; // Numero di elementi da generare
        List<Integer> listaCasuale = Es2.generaListaCasuale(n);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaConInverso = Es2.creaListaInversa(listaCasuale);
        System.out.println("Lista con inverso: " + listaConInverso);

        System.out.println("Valori in posizioni pari:");
        Es2.stampa(listaConInverso, true);

        System.out.println("Valori in posizioni dispari:");
        Es2.stampa(listaConInverso, false);
    }
}