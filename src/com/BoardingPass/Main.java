package com.BoardingPass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //InformationClass info = new InformationClass();
        Discount Fdiscount = new Discount();
        double temp = Fdiscount.customerDiscount(200, 10, "F");
        System.out.println(temp);
        InformationClass output = prompt();
        System.out.println(output.toString());

    }

    public static InformationClass prompt() {

        String name;
        String email;
        long phoneNum;
        String gender;
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your first and last name.");
        name = scan.nextLine();

        System.out.println("Please insert your Email address.");
        email = scan.nextLine();

        phoneNum = phoneNumber();

        System.out.println("What is your gender 'M', 'F', 'O'.");

        gender = scan.nextLine();

        while (!gender.equals("M") && !gender.equals("F") && !gender.equals("O")) {
            System.out.println("Invalid gender selected");
            gender = scan.nextLine();
        }


        System.out.println("What is your age.");
        age = scan.nextInt();

        while (age < 0 || age > 160) {
            System.out.println("Please enter a valid age!");
            age = scan.nextInt();
        }

        InformationClass info = new InformationClass(name, email, phoneNum, gender, age);


        return info;
    }


    public static Long  phoneNumber(){

        System.out.println("Please insert your phone number.");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        while (num.length() != 10) {
            System.out.println("Phone number must be 10 digits ");

            num = scan.nextLine();
        }

        try {
            Long phoneNum = Long.parseLong(num);
            return phoneNum;
        } catch (NumberFormatException e){
            phoneNumber();
            return Long.parseLong(num);
        }
    }


}
