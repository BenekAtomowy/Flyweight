package com.company;
/**
 * Autor : Emilian Ossowski
 *
 * Klasa reprezentująca składnik posiłku
 *
 * **/
public class Ogorek extends Zmiana {
   public Ogorek(Posilek posilek){
    super(posilek);
}

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Ogorek";
    }
}
