/*
Problem:
You are given N integers between 1 and 50. Find the count of numbers divisible by K.

Input Format
The input begins with two positive integers N, K. The next N lines contains one positive integer numbers
​
Output Format
Output a single number denoting how many integers are divisible by K.

*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N and K: ");
    int n = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num % k == 0) {
        count++;
      }
    }
    sc.close();
    System.out.println("Count: " + count);
  }
}

