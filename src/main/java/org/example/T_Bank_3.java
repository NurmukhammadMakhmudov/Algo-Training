package org.example;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class T_Bank_3 {

    static final int DATE = 1;
    static final int MONTH = 2;
    static final int YEAR = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mountDateCountInfo = new int[13];

        int[] birthdayDate = new int[3];
        int[] currentDate = new int[4];
        for (int i = 1; i < 3; i++) {
            birthdayDate[i] = scanner.nextInt();
        }
        for (int i = 1; i < 4; i++) {
            currentDate[i] = scanner.nextInt();
        }
        initMonthArray(mountDateCountInfo, currentDate[3]);
        int daysCount = 0;
        if (birthdayDate[MONTH] < currentDate[MONTH]) {
            // birthday passed
            // 20 01
            // 04 05 2000

            for (int i = currentDate[MONTH]; i <= 12 + birthdayDate[MONTH]; i++)
            {
                daysCount += mountDateCountInfo[i > 12? i - 12 : i];
            }
            daysCount -= currentDate[DATE];
            daysCount -= (mountDateCountInfo[birthdayDate[MONTH]] - birthdayDate[DATE]);

        } else if (birthdayDate[MONTH] == currentDate[MONTH] && currentDate[DATE] > birthdayDate[DATE]) {
            // birthday passed
            // 11 01
            // 20 01 2004
            daysCount = (currentDate[YEAR] % 4 == 0 && currentDate[YEAR] % 100 != 0)? 366 : 365;
            daysCount -= currentDate[DATE] - birthdayDate[DATE];

        }
        else if(birthdayDate[MONTH] == currentDate[MONTH] && currentDate[DATE] < birthdayDate[DATE])
        {
            // birthday in same month
            // 20 01
            // 11 01 2000
            daysCount = birthdayDate[DATE] - currentDate[DATE];

        }
        else
        {
            // birthday in near future
            //07 07
            //04 05 2005
            for (int i = currentDate[MONTH]; i < birthdayDate[MONTH]; i++)
            {
                daysCount += mountDateCountInfo[i];
            }
            daysCount += birthdayDate[DATE] - currentDate[DATE];

        }
        System.out.println(daysCount);
    }
    public static void initMonthArray(int[] arr, int currentYear)
    {
        arr[1] = 31;
        if (currentYear% 100 != 0 && currentYear% 4 == 0)
            arr[2] = 29;
        else
            arr[2] = 28;
        arr[3] = 31;
        arr[4] = 30;
        arr[5] = 31;
        arr[6] = 30;
        arr[7] = 31;
        arr[8] = 31;
        arr[9] = 30;
        arr[10] = 31;
        arr[11] = 30;
        arr[12] = 31;
    }

}

