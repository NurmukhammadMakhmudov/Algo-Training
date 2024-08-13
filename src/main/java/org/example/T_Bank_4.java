package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class T_Bank_4 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        HashMap<Integer,Integer> mapOfDigits = new HashMap<>();
        scanner.nextInt();
        int index = 0;
        int numberCounter = 0;
        while (scanner.hasNext())
        {
            char c = (char) scanner.nextByte();
            System.out.println(c);
         if (c <= 9){
             numberCounter++;
         } else if (c == '\n') {
             mapOfDigits.put(index, numberCounter);
             index++;
             numberCounter = 0;
         }

        }

    }
}
