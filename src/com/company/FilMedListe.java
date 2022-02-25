package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FilMedListe {

    public ArrayList<Postnumre> filListe() throws FileNotFoundException {
    ArrayList<Postnumre> liste = new ArrayList<>();
    File fil = new File("src/resources/danske-postnumre-byer-ny.csv");
    Scanner scan= new Scanner(fil);

    scan.nextLine();
    while(scan.hasNext()){
        String array[]=scan.nextLine().split(";");
        Postnumre postB = new Postnumre(Integer.parseInt(array[0]),array[1]);
        liste.add(postB);
    }
    return liste;
    }
}
