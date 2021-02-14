package pro.aidar.ps2.project;

import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {
        greeting();
    }


    public static void greeting(){
        Scanner getData = new Scanner(System.in);

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String name = getData.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String place = getData.nextLine();
        System.out.print("Great! " + place + " sounds like a great trip");

    }

}


