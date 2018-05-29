package com.company;

public class Mieso extends Zmiana {
    public Mieso(Posilek posilek){
        super(posilek);
    }

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Mieso";
    }
}
