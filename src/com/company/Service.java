package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;

public class Service {
    FilMedListe repo = new FilMedListe();
    ArrayList<Postnumre> nyliste;
    

    public Service() throws FileNotFoundException {
        nyliste = repo.filListe();
    }

    public Postnumre postRetur(int svar1){


        for(int i=0; i<nyliste.size();i++) {
            if (nyliste.get(i).getPostnummer() == svar1) {
                return nyliste.get(i);
            }
        }
        return null;
    }

    public ArrayList<Postnumre> byRetur(String svar2){

        ArrayList<Postnumre> nyliste2= new ArrayList<>();

        for(int i=0; i<nyliste.size(); i++){
            if((nyliste.get(i).getByer().equals(svar2))){
            System.out.println(nyliste.get(i));

                nyliste2.add(nyliste.get(i));
            }
        }
        return nyliste2;
    }
}