package it.prova.centrocommerciale.model;

public class Commesso extends Lavoratore {


    @Override
    boolean handleItemAdd(Item item) {
        return true;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return true;
    }
}
