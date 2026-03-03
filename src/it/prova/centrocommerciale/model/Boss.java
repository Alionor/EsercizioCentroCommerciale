package it.prova.centrocommerciale.model;

public class Boss extends Lavoratore {
    @Override
    boolean handleItemAdd(Item item) {
        return false;
    }

    @Override
    boolean handleItemRemove(Item item) {
        return false;
    }
}
