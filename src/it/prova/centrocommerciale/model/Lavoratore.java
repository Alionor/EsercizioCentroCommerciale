package it.prova.centrocommerciale.model;

public abstract class Lavoratore {

    protected String nome;
    protected String cognome;
    protected Negozio negozio;

    public Lavoratore(String nome, String cognome, Negozio negozio) {
        this.nome = nome;
        this.cognome = cognome;
        this.negozio = negozio;
    }

    public Lavoratore() {
    }

    abstract boolean handleItemAdd(Item item);

    abstract boolean handleItemRemove(Item item);

}
