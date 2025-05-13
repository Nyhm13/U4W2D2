package HomeWorks;

public class MainRubrica {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        // Aggiunta di contatti
        rubrica.aggiungiContatto("Mario Rossi", "123456789");
        rubrica.aggiungiContatto("Luigi Bianchi", "987654321");

        // Stampa dei contatti
        rubrica.stampaContatti();

        // Ricerca del numero di telefono per nome
        System.out.println("Numero di Mario Rossi: " + rubrica.cercaNumeroPerNome("Mario Rossi"));

        // Ricerca del nome per numero di telefono
        System.out.println("Nome per numero 987654321: " + rubrica.cercaNomePerNumero("987654321"));

        // Rimozione di un contatto
        rubrica.rimuoviContatto("Mario Rossi");

        // Stampa dei contatti aggiornati
        rubrica.stampaContatti();
    }
}