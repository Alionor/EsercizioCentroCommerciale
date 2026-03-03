package it.prova.centrocommerciale.model;

public class Item {

    String codice;
    String descrizione;
    int prezzo;
    Negozio negozio;

    public Item(String codice, String descrizione, int prezzo, Negozio negozio) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.negozio = negozio;
    }

    public Item() {
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public Negozio getNegozio() {
        return negozio;
    }

    public void setNegozio(Negozio negozio) {
        this.negozio = negozio;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codice='" + codice + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", negozio=" + negozio +
                '}';
    }
}
