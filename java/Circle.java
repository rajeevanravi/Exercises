/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double radius = sc.nextDouble();
    sc.close();

    double area = Math.PI * radius * radius;
    double perimeter = 2 * Math.PI * radius;

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }
}
