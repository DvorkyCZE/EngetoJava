package com.engeto.examples;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Jméno klienta
        String client = "Marek Dvořák";
        // Počet nákupů
        int numOfPurchase = 1;
        // Název města
        String city= "Písek";
        // Spotřeba paliva
        double consuption = 5.2;
        // Množství(délka) kabelů
        double cableLength = 22.99;
        // Datum narození
        LocalDate clientsBirthDate = LocalDate.of(1991,5,2);
        // Registrační značka
        String spz = "4A7 2505";
        // IP adresa
        String ipAddress = "192.168.1.1";
        System.out.println( "Jméno clienta: " + client +
                            "\nPočet nákupů: " + numOfPurchase +
                            "\nNázev města: " + city +
                            "\nSpotřeba paliva: " + consuption +
                            "\ndélka kabelů: " + cableLength +
                            "\nDatum narození: "   +clientsBirthDate +
                            "\nSPZ: "  +spz+
                            "\nIp adresa: " +ipAddress);

    }
}
