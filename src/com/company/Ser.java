package com.company;

public class Ser extends Zmiana{
    public Ser(Posilek posilek){
        super(posilek);
    }

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Ser";
    }
}
