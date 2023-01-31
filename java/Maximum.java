/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = sc.nextInt();
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num > max) {
        max = num;
      }
    }
    sc.close();
    System.out.println("Max: " + max);
  }
}
