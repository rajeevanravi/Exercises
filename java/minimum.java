/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter X: ");
    int x = sc.nextInt();
    System.out.print("Enter Y: ");
    int y = sc.nextInt();
    sc.close();

    if (x < y) {
      System.out.println("Take the first cab service");
    } else {
      System.out.println("Take the second cab service");
    }
  }
}
