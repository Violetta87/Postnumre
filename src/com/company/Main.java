package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Service service= new Service();
        Scanner scan= new Scanner(System.in);
        System.out.println("*------------------------------------------------------------------------------------------*");
        System.out.println("|                           Velkommen  \"Find en by eller et postnummer\"                  |");
        System.out.println("|                            Indtast enten et postnummer en by og find det der passer med  |");
        System.out.println("*------------------------------------------------------------------------------------------*");
        System.out.println("                                  |                      |                                  ");
        System.out.println("                                  |                      |                                  ");
        System.out.println("                         *---------------------------------------*                          ");
        System.out.println("                         | Søg på et postnummer        (press 1) |                          ");
        System.out.println("                         | Søg på en by                (press 2) |                          ");
        System.out.println("                         *---------------------------------------*                          ");

        int svar= scan.nextInt();

        switch(svar){
            case 1:
                System.out.println("Indtast postnummer");
                int svar1= scan.nextInt();
                System.out.println(service.postRetur(svar1));
                break;
            case 2:
                System.out.println("Indtast by");
                scan.nextLine();
                String svar2 = scan.nextLine();
                System.out.println(service.byRetur(svar2));

                break;
            default:
                System.out.println("try again");
        }

    }
}
