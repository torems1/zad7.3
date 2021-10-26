package com.company;

public class Adress {
    private  String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String korpus;
    private String flat;

    public Adress(String address){
        String[] ad1Array=address.split(",");
        country=ad1Array[0];
        region=ad1Array[1];
        city=ad1Array[2];
        street=ad1Array[3];
        house=ad1Array[4];
        korpus=ad1Array[5];
        flat=ad1Array[6];
    }
    public void out(){
        System.out.println("i live in "+country+
                "Region "+region+
                " City "+city+
                " Street "+street+
                " House "+house+
                " Korpus "+korpus+
                " Flat "+flat);
    }
}
