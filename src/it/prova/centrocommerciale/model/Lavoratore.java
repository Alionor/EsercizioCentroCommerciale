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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Negozio getNegozio() {
        return negozio;
    }

    public void setNegozio(Negozio negozio) {
        this.negozio = negozio;
    }

    abstract boolean handleItemAdd(Item item);

    abstract boolean handleItemRemove(Item item);

}
