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

    public static Airports(){
            //Created a method called port that returns a Map object that holds the Three Letter Key for airports and
//their Latitude and Longitude
            public Map<String, List<Double>> port(){
                //Created the HashMap that holds the Three Letter Key and List of Latitude and Longitude for values
                Map<String, List<Double>> latLog = new HashMap<>();
                //Creating multiple lists to hold the Latitude and Longitude values
                List<Double> jfkLatLon = new ArrayList<>();
                List<Double> iahLatLon = new ArrayList<>();
                List<Double> sanLatLon = new ArrayList<>();
                List<Double> miaLatLon = new ArrayList<>();
                List<Double> laxLatLon = new ArrayList<>();
                List<Double> lasLatLon = new ArrayList<>();
                List<Double> phxLatLon = new ArrayList<>();
                List<Double> hnlLatLon = new ArrayList<>();
                List<Double> msyLatLon = new ArrayList<>();
                List<Double> detLatLon = new ArrayList<>();
                //Adding the Latitude and Longitude of each airport
                jfkLatLon.add(40.6413); jfkLatLon.add(73.7781);
                iahLatLon.add(29.9902); iahLatLon.add(95.3368);
                sanLatLon.add(37.7749); sanLatLon.add(122.4194);
                miaLatLon.add(25.7617); miaLatLon.add(80.1918);
                laxLatLon.add(33.9416); laxLatLon.add(118.4085);
                lasLatLon.add(36.1699); lasLatLon.add(115.1398);
                phxLatLon.add(33.4484); phxLatLon.add(112.0740);
                hnlLatLon.add(21.3069); hnlLatLon.add(157.8583);
                msyLatLon.add(29.9911); msyLatLon.add(90.2592);
                detLatLon.add(42.3314); detLatLon.add(42.3314);
                //Putting the three letter keys and list of Latitude and Longitude into the Hashmap
                latLog.put("JFK", jfkLatLon);
                latLog.put("IAH", iahLatLon);
                latLog.put("SAN", sanLatLon);
                latLog.put("MIA", miaLatLon);
                latLog.put("LAX" , laxLatLon);
                latLog.put("LAS", lasLatLon);
                latLog.put("PHX", phxLatLon);
                latLog.put("HNL", hnlLatLon);
                latLog.put("MSY", msyLatLon);
                latLog.put("DET", detLatLon);

                return  latLog;
        }
    }
}
