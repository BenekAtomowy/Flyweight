package com.company;

public class SosPom extends Zmiana {
    public SosPom(Posilek posilek){
        super(posilek);
    }

    @Override
    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + Sos pomidorowy";
    }
}
