package src;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("¡Bienvenid@ a Guess the Number!" +
                " donde debes adivinar un número de 1 a 100 y cuentas con 5 intentos." +
                " ¡Suerte! 😊");

        int randomNumber = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        System.out.println(randomNumber);

        int tries = 0;


        while (tries < 5) {
            // Entrada de datos del jugador
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------------------Ingresa un número--------------------------- ");

            // Guardar número del jugador
            int userNumber = sc.nextInt();

            if (userNumber > randomNumber) {
                System.out.println("Oh, tu número es muy alto ☹️");
            } else if (userNumber < randomNumber) {
                System.out.println("Oh, tu número es muy bajo ☹️");
            } else {
                System.out.println("Haz acertado el número! 🤗");
            }

            // Turno de la Robbie la maquina
            System.out.println("---------------------------Es el turno de Robbie---------------------------");
            int computerNumber = (int) Math.floor(Math.random() * 100 + 1);
            Thread.sleep(500);
            System.out.println("Robbie eligio: " + computerNumber);

            if (computerNumber > randomNumber) {
                System.out.println("Oh, el número es muy alto ☹️");
            } else if (computerNumber < randomNumber) {
                System.out.println("Oh, el número es muy bajo ☹️");
            } else {
                System.out.println("¡Robbie ha acertado el número! 🤗");
                break;
            }

            tries++;
        }

    }

}