package JAVAEASYEG;

import java.util.Scanner;

public class pattern2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be printed: ");
        int num = scan.nextInt();
        System.out.print("Enter the maximum number of times printed: ");
        int max = scan.nextInt();
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        for (int i = max - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
        scan.close();
    }
}