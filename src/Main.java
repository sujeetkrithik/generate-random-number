import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int min = scr.nextInt();
        int max = scr.nextInt();
//        int random_number = (int) ((Math.random() * (max - min)) + min);
        double random_number1 = Math.random() * (max - min + 1) + min;
        System.out.println(random_number1);
        int random_number2 = (int) (Math.random() * (max - min) + 1) + min;
        System.out.println(random_number2);
    }
}