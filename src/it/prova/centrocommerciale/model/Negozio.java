package it.prova.centrocommerciale.model;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

    private String ragioneSociale;
    private String partitaIVA;
    private CentroCommerciale centroCommerciale;
    private List<Item> items = new ArrayList<>();
    private List<Lavoratore> lavoratori = new ArrayList<>();

    public Negozio(String ragioneSociale, String partitaIVA, CentroCommerciale centroCommerciale, List<Item> item, List<Lavoratore> lavoratori) {
        this.ragioneSociale = ragioneSociale;
        this.partitaIVA = partitaIVA;
        this.centroCommerciale = centroCommerciale;
        this.items = item;
        this.lavoratori = lavoratori;
    }

    public Negozio() {
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    public CentroCommerciale getCentroCommerciale() {
        return centroCommerciale;
    }

    public void setCentroCommerciale(CentroCommerciale centroCommerciale) {
        this.centroCommerciale = centroCommerciale;
    }

    public List<Item> getItem() {
        return items;
    }

    public void setItem(List<Item> item) {
        this.items = item;
    }

    public List<Lavoratore> getLavoratori() {
        return lavoratori;
    }

    public void setLavoratori(List<Lavoratore> lavoratori) {
        this.lavoratori = lavoratori;
    }

    /**
     * Metodo che passa un lavoratore e un oggetto come parametro, controlla che
     * il lavoratore possa effettivamente aggiungere un item, esegue il lavoro
     * in caso afferamtivo e restituisce true o false a seconda che abbia o meno
     * eseguito il lavoro.
     **/
    public boolean addToItems(Lavoratore lavoratore, Item item) {
        if (this.lavoratori.contains(lavoratore)
                && lavoratore.handleItemAdd(item)
                && !this.items.contains(item)) {
            return this.getItem().add(item);
        } else {
            return false;
        }
    }

    /**
     * Metodo che passa un lavoratore e un oggetto come parametro, controlla che
     * il lavoratore possa effettivamente rimuovere un item, esegue il lavoro
     * in caso afferamtivo e restituisce true o false a seconda che abbia o meno
     * eseguito il lavoro.
     **/
    public boolean removeFromItems(Lavoratore lavoratore, Item item) {
        if (this.lavoratori.contains(lavoratore)
                && lavoratore.handleItemRemove(item)
                && this.items.contains(item)
        ) {
            return this.getItem().remove(item);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Negozio{" +
                "ragioneSociale='" + ragioneSociale + '\'' +
                ", partitaIVA='" + partitaIVA + '\'' +
                ", centroCommerciale=" + centroCommerciale +
                ", item=" + items +
                ", lavoratori=" + lavoratori +
                '}';
    }
}
