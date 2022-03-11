package com.BoardingPass;

public class Discount {
    double ticketPrice;
    double temp = customerDiscount(125, 10, "M");
    public double customerDiscount(double ticket, int age, String gender){
        if (age <= 12){
            ticketPrice = ticket /2;
            return ticketPrice;
        } else if (age >= 60){
            ticketPrice = ticket * .40;
            return ticketPrice;
        } else if (gender.equals("F")){
            ticketPrice = ticket * 0.75;
            return ticketPrice;
        } else {
            System.out.println("Sorry there is no discount available for you!");
            return ticket;
        }
    }


}
