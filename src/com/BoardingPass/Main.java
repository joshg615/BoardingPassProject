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
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what's your name");
        name = scan.nextLine();
        InformationClass info = new InformationClass(name);
        return info;

    }
}
