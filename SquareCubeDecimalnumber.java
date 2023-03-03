package JAVAEASYEG;
import java.util.Scanner;
public class SquareCubeDecimalnumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    double num = sc.nextDouble();
    double square = num * num;
    double cube = num * num * num;
    System.out.println("Square of " + num + ": " + square);
    System.out.println("Cube of " + num + ": " + cube);
  }
}
