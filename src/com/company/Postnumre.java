package com.company;

public class Postnumre {
    private int postnummer;
    private String byer;

    public Postnumre(int postnummer, String byer){
        this.postnummer= postnummer;
        this.byer= byer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public int getPostnummer() {
        return postnummer;
    }
    public void setByer(String byer) {
        this.byer = byer;
    }

    public String getByer() {
        return byer;
    }

    @Override
    public String toString() {
        return "Postnumre{" +
                "postnummer=" + postnummer +
                ", byer='" + byer + '\'' +
                '}';
    }
}
