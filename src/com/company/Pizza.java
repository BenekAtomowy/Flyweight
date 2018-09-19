package com.company;
/**
 * Autor : Emilian Ossowski
 *
 * Klasa reprezentująca rodzaj posiłku
 *
 * **/
public class Pizza implements Posilek {
    @Override
    public String dawajNazwe() {
        return "Pizza =";
    }
}
