package it.prova.centrocommerciale.model;

public class PersonaleAmministrativo extends Lavoratore {

    public PersonaleAmministrativo() {
    }
    public PersonaleAmministrativo(String nome, String cognome, Negozio negozio) {
        this.nome = nome;
        this.cognome = cognome;
        this.negozio = negozio;
    }

    @Override
    boolean handleItemAdd(Item item) {
        return true;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return false;
    }
}
