package src;

import java.util.Scanner;

public class GuessTheNumber {
    public static  void  main(String[] args) {
        System.out.println("¡Bienvenid@ a Guess the Number!, dondé debes de adivinar un número de 1 a 100 donde contaras con 5 intentos. ¡Suerte! ☺");

        int randomNumber = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
        System.out.println(randomNumber);


        for (int i = 0; i < 5; i++) {
            // Entrada de datos
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa un número: ");

            // Guardar número del jugador
            int userNumber = sc.nextInt();

            if (userNumber > randomNumber){
                System.out.println("Oh, tu número es muy alto :(");
            } else if (userNumber < randomNumber) {
                System.out.println("Oh, tu número es muy bajo :(");
            }  else {
                System.out.println("Haz acertado el número! ☻");
            }

        }
    }
    }

