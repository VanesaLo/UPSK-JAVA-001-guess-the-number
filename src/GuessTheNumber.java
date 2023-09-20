package src;

import java.util.Scanner;

public class GuessTheNumber {
    public static  void  main(String[] args) {
        System.out.println("Bienvenid@ a Guess the Number, donde debes de adivinar un número de 1 a 100");

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        String numberUser = sc.nextLine();
        if (numberUser == "100") System.out.println("El número" + numberUser + "es 100");
        else {
         System.out.println("El número no es 100");
        }
        }
    }

