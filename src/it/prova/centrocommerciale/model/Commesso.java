package it.prova.centrocommerciale.model;

public class Commesso extends Lavoratore {

    public Commesso() {
    }
    public Commesso(String nome, String cognome, Negozio negozio) {
        this.nome = nome;
        this.cognome = cognome;
        this.negozio = negozio;
    }

    @Override
    boolean handleItemAdd(Item item) {
        return this.getNegozio().getItem().add(item);
    }

    @Override
    boolean handleItemRemove(Item item) {
        return this.getNegozio().getItem().remove(item);
    }
}
