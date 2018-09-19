package com.company;
/**
 * Autor : Emilian Ossowski
 *
 * Klasa reprezentująca składnik posiłku
 *
 * **/
public class Ser extends Zmiana{
    public Ser(Posilek posilek){
        super(posilek);
    }

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Ser";
    }
}
