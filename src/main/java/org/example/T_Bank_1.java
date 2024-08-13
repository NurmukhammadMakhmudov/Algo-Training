package org.example;

import java.util.Scanner;

public class T_Bank_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int washerCount = scanner.nextInt();
        int carCount = scanner.nextInt();
        int halfOfTimeToWash = scanner.nextInt();

        int carsPerWasher = carCount / washerCount;
        boolean isExtraCars = carCount % washerCount > 0;
        System.out.println(halfOfTimeToWash * 2 * carsPerWasher + (isExtraCars? halfOfTimeToWash * 2 : 0 ));

    }
}