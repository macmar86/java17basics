package main.org.maciek.section2;

import java.util.Arrays;

public class Ex234 {

    public static void main(String[] args) {

//exercise 2
        //2. Create an array and initialize it with the days of the week.
        //2.1.Use System.out.println() to print:
        //2.1.1.The number of items in the array

        String[] weekDays1 = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String weekDays2[] = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String[] weekDays3 = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String weekDays4[] = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        System.out.println(weekDays1.length);
        System.out.println(weekDays1[3]);

//exercise 3
        //3. Create an array and initialize it with numbers, 1-10.

        int[] num10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(num10.length);

//exercise 4
        //4. Try creating an array to represent the tic-tac-toe board to the right.
        //4.1.How would you access the value in the bottom right square with
        //Java code?

        String[][] oix = {{"o", "x", "x"}, {"x", "o", "o"}, {"x", "o", "o"}};
        System.out.println(Arrays.deepToString(oix));
        System.out.println(oix[2][2]);

    }

}
