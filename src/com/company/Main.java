package com.company;

public class Main {

    public static void main(String[] args) {
        Adress adress1=new Adress("Russia,Samaraskya,Togliytty,Koroleva,24,7,205");
        Adress adress2=new Adress("Russia,Samaraskya,Togliytty,Ivanova,31,3,20");
        Adress adress3=new Adress("Russia,Samaraskya,Samara,Moskovsaya,13,2,101");
        Adress adress4=new Adress("Russia,Samaraskya,Togliytty,Lenina,2,4,43");

        adress1.out();
        adress2.out();
        adress3.out();
        adress4.out();
    }
}
