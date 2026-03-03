package it.prova.centrocommerciale.model;

import java.util.ArrayList;
import java.util.List;

public class Negozio {

    private String ragioneSociale;
    private String partitaIVA;
    private CentroCommerciale centroCommerciale;
    private List<Item> item = new ArrayList<>();

    public Negozio(String ragioneSociale, String partitaIVA, CentroCommerciale centroCommerciale, List<Item> item) {
        this.ragioneSociale = ragioneSociale;
        this.partitaIVA = partitaIVA;
        this.centroCommerciale = centroCommerciale;
        this.item = item;
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
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    /*public boolean addToItems(Lavoratore lavoratore, Item item) {

    }

    public boolean removeFromItems(Lavoratore lavoratore, Item item) {

    }*/

    @Override
    public String toString() {
        return "Negozio{" +
                "ragioneSociale='" + ragioneSociale + '\'' +
                ", partitaIVA='" + partitaIVA + '\'' +
                ", centroCommerciale=" + centroCommerciale +
                ", item=" + item +
                '}';
    }
}
