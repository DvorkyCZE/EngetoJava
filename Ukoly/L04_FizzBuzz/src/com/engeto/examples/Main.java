package com.engeto.examples;

import java.util.Scanner;

// zkouška commitu

public class Main {

    public static void fizzBuzz(){
        Scanner vstup= new Scanner(System.in);
        System.out.print("Zadejte konečné číslo posloupnosti, program se automaticky spustí:");
        int limit = vstup.nextInt();
        System.out.println("Zadali jste číslo " + limit + ". \n");

        for (int i = 1; i <= limit; i++){
            if ( (i % 3==0) && (i % 5==0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else System.out.println(i);
        };
    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}
