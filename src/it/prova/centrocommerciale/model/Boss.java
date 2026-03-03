package it.prova.centrocommerciale.model;

public class Boss extends Lavoratore {

    public Boss() {
    }
    public Boss(String nome, String cognome, Negozio negozio) {
        this.nome = nome;
        this.cognome = cognome;
        this.negozio = negozio;
    }

    @Override
    boolean handleItemAdd(Item item) {
        return false;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return false;
    }
}
