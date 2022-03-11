package com.BoardingPass;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BoardingTicket {
    public static void passNum() {
        Random randomObj = new Random();
        Set set = new HashSet<Integer>();

        for (int i = 1; i <= 1; i++) {
            int randomNumber = randomObj.nextInt(99999);
            if (!set.contains(randomNumber)) {
                set.add(randomNumber);
                System.out.println(i + " Boarding Ticket Number: " + randomNumber);
            } else i--;
        }
    }
}
