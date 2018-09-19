package com.company;
/**
 * Autor : Emilian Ossowski
 *
 * Klasa reprezentująca składnik posiłku
 *
 * **/
public class Mieso extends Zmiana {
    public Mieso(Posilek posilek){
        super(posilek);
    }

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Mieso";
    }
}
