package it.prova.centrocommerciale.test;

import it.prova.centrocommerciale.model.*;

import java.util.ArrayList;
import java.util.List;

public class TestCentroCommerciale {

    public static void main(String[] args) {

        CentroCommerciale centro = new CentroCommerciale(
                "Centro MegaStore",
                "Via Roma 123, Milano"
        );

        List<Item> itemsNegozio1 = new ArrayList<>();
        List<Lavoratore> lavoratoriNegozio1 = new ArrayList<>();

        List<Item> itemsNegozio2 = new ArrayList<>();
        List<Lavoratore> lavoratoriNegozio2 = new ArrayList<>();

        List<Item> itemsNegozio3 = new ArrayList<>();
        List<Lavoratore> lavoratoriNegozio3 = new ArrayList<>();

        List<Item> itemsNegozio4 = new ArrayList<>();
        List<Lavoratore> lavoratoriNegozio4 = new ArrayList<>();

        Negozio negozio1 = new Negozio("TechWorld", "IT11111111111", centro, itemsNegozio1, lavoratoriNegozio1);
        Negozio negozio2 = new Negozio("SmartStore", "IT22222222222", centro, itemsNegozio2, lavoratoriNegozio2);
        Negozio negozio3 = new Negozio("DigitalZone", "IT33333333333", centro, itemsNegozio3, lavoratoriNegozio3);
        Negozio negozio4 = new Negozio("ComputerCity", "IT44444444444", centro, itemsNegozio4, lavoratoriNegozio4);

        Lavoratore c1 = new Commesso("Luca", "Rossi", negozio1);
        Lavoratore c2 = new Commesso("Marco", "Bianchi", negozio2);
        Lavoratore c3 = new Commesso("Paolo", "Verdi", negozio3);
        Lavoratore c4 = new Commesso("Gianni", "Blu", negozio4);

        Lavoratore b1 = new Boss("Giovanni", "Boss1", negozio1);
        Lavoratore b2 = new Boss("Carlo", "Boss2", negozio2);
        Lavoratore b3 = new Boss("Franco", "Boss3", negozio3);
        Lavoratore b4 = new Boss("Luigi", "Boss4", negozio4);

        Lavoratore a1 = new PersonaleAmministrativo("Anna", "Neri", negozio1);
        Lavoratore a2 = new PersonaleAmministrativo("Sara", "Blu", negozio2);
        Lavoratore a3 = new PersonaleAmministrativo("Laura", "Rosa", negozio3);
        Lavoratore a4 = new PersonaleAmministrativo("Elena", "Viola", negozio4);

        lavoratoriNegozio1.add(c1); lavoratoriNegozio1.add(b1); lavoratoriNegozio1.add(a1);
        lavoratoriNegozio2.add(c2); lavoratoriNegozio2.add(b2); lavoratoriNegozio2.add(a2);
        lavoratoriNegozio3.add(c3); lavoratoriNegozio3.add(b3); lavoratoriNegozio3.add(a3);
        lavoratoriNegozio4.add(c4); lavoratoriNegozio4.add(b4); lavoratoriNegozio4.add(a4);

        Item i1 = new Item("N1_1", "Laptop", 1200, negozio1);
        Item i2 = new Item("N1_2", "Mouse", 20, negozio1);
        Item i3 = new Item("N1_3", "Tastiera", 80, negozio1);
        Item i4 = new Item("N1_4", "Monitor", 250, negozio1);
        Item i5 = new Item("N1_5", "Stampante", 150, negozio1);

        itemsNegozio1.add(i1);
        itemsNegozio1.add(i2);
        itemsNegozio1.add(i3);
        itemsNegozio1.add(i4);
        itemsNegozio1.add(i5);

        Item i6 = new Item("N2_1", "Tablet", 400, negozio2);
        Item i7 = new Item("N2_2", "Smartphone", 900, negozio2);
        Item i8 = new Item("N2_3", "Cover", 15, negozio2);
        Item i9 = new Item("N2_4", "Caricatore", 25, negozio2);
        Item i10 = new Item("N2_5", "Powerbank", 35, negozio2);

        itemsNegozio2.add(i6);
        itemsNegozio2.add(i7);
        itemsNegozio2.add(i8);
        itemsNegozio2.add(i9);
        itemsNegozio2.add(i10);

        Item i11 = new Item("N2_1", "Tablet", 400, negozio3);
        Item i12 = new Item("N2_2", "Smartphone", 900, negozio3);
        Item i13 = new Item("N2_3", "Cover", 15, negozio4);
        Item i14 = new Item("N2_4", "Caricatore", 25, negozio4);
        Item i15 = new Item("N2_5", "Powerbank", 35, negozio4);

        itemsNegozio3.add(i11);
        itemsNegozio3.add(i12);
        itemsNegozio4.add(i13);
        itemsNegozio4.add(i14);
        itemsNegozio4.add(i15);

        //commesso prova ad aggiungere -> true
        System.out.println("add: "
                + negozio1.addToItems(c1, new Item("NEW1", "Nuovo PC", 2000, negozio1)));
        //amministratore prova ad aggiungere -> true
        System.out.println("add: "
                + negozio2.addToItems(a2, new Item("NEW2", "Nuovo Tablet", 600, negozio2)));
        //boss prova ad aggiungere -> false
        System.out.println("add: "
                + negozio3.addToItems(b3, new Item("NEW3", "Nuovo Monitor", 300, negozio3)));
        //commesso prova ad aggiungere -> false (già presente item)
        System.out.println("add: "
                + negozio1.addToItems(c1, i1));
        //commesso prova a rimuovere -> true
        System.out.println("remove: "
                + negozio1.removeFromItems(c1, i2));
        //amministratore prova a rimuovere -> false (non può)
        System.out.println("remove: "
                + negozio2.removeFromItems(a2, i6));
        //boss prova a rimuovere -> false (non può)
        System.out.println("remove: "
                + negozio3.removeFromItems(b3, i12));
        //commesso prova a rimuovere -> false (non è presente l'item)
        System.out.println("remove: "
                + negozio4.removeFromItems(c4, i6));
    }
}