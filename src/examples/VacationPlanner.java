package examples;

import java.util.Scanner;

public class VacationPlanner {

    private static void welcomeToPlanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = input.next();
        String name1 = input.next();
        System.out.print("Nice to meet you " + name + " " + name1 + ", where are you travelling to?");
        String city = input.next();
        String city1 = input.next();
        System.out.println("Great! " + city + " " + city1 + " sound like a great trip");
    }

    private static void stars() {
        for(int i = 1; i < 11; i++) {
            System.out.print("*");
        }
    }

    private static void budgetToPlanner() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling?");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for you travel destination?");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD?");
        double convert = input.nextDouble();
        System.out.println();
        int hours = 24 * days;
        int minutes = hours * 60;
        double spendusd = money / days;
        double budgetconvert;
        budgetconvert = money * convert;
        double budgetconvperday = (budgetconvert / days);
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + spendusd + " USD");
        System.out.println("Your total budget in " + symbol + " is " + budgetconvert + " " + symbol + ", which per day is " + budgetconvperday + " " + symbol);
    }

    private static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int difference = input.nextInt();
        int midnight = difference%24;
        int noon = 12 + difference%12;
        System.out.println("That means that it is midnight at home it will be " + midnight + ":00 in your travel destination");
        System.out.println("and when it is noon at home it will be " + noon + ":00");
    }

     private static void areas() {
         Scanner input = new Scanner(System.in);
         System.out.print("What is the square area of your destination country in km2?");
         int areakm2 = input.nextInt();
         //int midnight = difference%24;
         double areamiles2 = areakm2 * 0.62137;
         System.out.println("In miles2 that is " + areamiles2);
    }
     public static void main(String[] args) {
         welcomeToPlanner();
         stars();
         System.out.println();
         budgetToPlanner();
         stars();
         System.out.println();
         times();
         stars();
         System.out.println();
         areas();
         stars();
     }
}
