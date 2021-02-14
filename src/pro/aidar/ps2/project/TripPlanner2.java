package pro.aidar.ps2.project;

import java.util.Scanner;

public class TripPlanner2 {

    public static void main(String[] args) {
        travelTimeBudget();
    }


    private static void travelTimeBudget(){
        Scanner getData = new Scanner(System.in);
        System.out.println("How many days are you going to spend traveling? ");
        int dayCount = getData.nextInt();

        int hours = dayCount * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
        int usd = getData.nextInt();


        System.out.println("What is the three letter currency symbol for your travel destination? ");
        String currency = getData.next();

        System.out.println("How many " + currency + " are there in 1 USD? ");
        float difference = getData.nextFloat();

        System.out.println("If you are traveling for " + dayCount +
                " days that is same as " + hours + " hours or "+ minutes + " minutes or "+seconds+" seconds.");

        float raw = (float) usd / dayCount;
        System.out.println("If you are going to spend $ " + usd + " USD that means per day you can spend up to $"+ fmt(raw) +" USD");

        float rawDifference = (float) usd * difference;
        float rawDay = (float) rawDifference / dayCount;
        System.out.println("Your total budget in " +currency+ " is " +fmt(rawDifference)+ " " + currency +
                ", which per day is "+ fmt(rawDay) + " "+ currency);

    }

    public static double fmt(float d)
    {
        return Math.round(d * 100.0)/100.0;
//        if(d == (long) d)
//            return String.format("%.1f",d);
//        else
//            return String.format("%.2f",d);
    }


}


