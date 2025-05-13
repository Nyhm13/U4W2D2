package HomeWorks;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    // Costruttore
    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    // 1. Inserimento di una coppia <Nome, telefono>
    public void aggiungiContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " -> " + telefono);
    }

    // 2. Cancellazione di una coppia <Nome, telefono> a partire dal nome
    public void rimuoviContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    // 3. Ricerca di una Persona di cui si conosce il numero di telefono
    public String cercaNomePerNumero(String telefono) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return "Nessun contatto trovato per il numero: " + telefono;
    }

    // 4. Ricerca del numero di telefono di una Persona di cui si conosce il Nome
    public String cercaNumeroPerNome(String nome) {
        return rubrica.getOrDefault(nome, "Nessun numero trovato per il nome: " + nome);
    }

    // 5. Stampa di tutti i contatti con nome e numero
    public void stampaContatti() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Contatti nella rubrica:");
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}