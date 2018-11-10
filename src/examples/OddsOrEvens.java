package examples;

import java.util.Random;
import java.util.Scanner;

public class OddsOrEvens {

    private static void welcomeToGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String letter = input.next();
            if (letter.equals('O')) {
                System.out.println(name + " has picked odds! The computer will be evens.");
            } else {
                System.out.println(name + " has picked evens! The computer will be odds.");
        }
    }

    private static void sumOddsAndEvens() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many \"fingers\" do you put out? ");
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\"");
    }

    private   static  void liner() {
        for (int i = 1; i <= 52; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        welcomeToGame();
        liner();
        sumOddsAndEvens();
        liner();
    }
}