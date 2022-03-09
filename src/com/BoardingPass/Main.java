package com.BoardingPass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //InformationClass info = new InformationClass();
        InformationClass output = prompt();
        System.out.println(output.toString());
    }

    public static InformationClass prompt(){
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
        System.out.println("Please insert your phone number.");
        phoneNum =Long.parseLong (scan.nextLine());
        System.out.println("What is your gender 'M', 'F', 'O'.");
        gender = scan.nextLine();
        System.out.println("What is your age.");
        age = scan.nextInt();
        InformationClass info = new InformationClass(name,email,phoneNum,gender,age);
        return info;

    }
}
