package com.company;
/**
 * Autor : Emilian Ossowski
 *
 * Klasa reprezentująca składnik posiłku
 *
 * **/
public class SosPom extends Zmiana {
    public SosPom(Posilek posilek){
        super(posilek);
    }

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Sos pomidorowy";
    }
}
