package com.company;

public class Main {

    public static void main(String[] args) {
        Posilek p1 = new Pizza();
        p1 = new SosPom(p1);
        System.out.println(p1.dawajNazwe());
        p1 = new Ser(p1);
        System.out.println(p1.dawajNazwe());
        Posilek p2 = new Burger();
        p2= new Ser(p2);
        p2= new Mieso(p2);
        p2= new Ogorek(p2);
        System.out.println(p2.dawajNazwe());
    }
}
