/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = 1;
    int d = 10;

    int sum1 = new Calculate().sum(a, b);
    int sum2 = new Calculate().sumBetween(c, d);

    System.out.println(new App().getGreeting());
    System.out.print("Sum of " + a + " and " + b + " is " + sum1 + ". ");
    System.out.println("Average is " + new Calculate().average(sum1, 2) + ".");
    System.out.print("Sum of " + c + " to " + d + " is " + sum2 + ". ");
    System.out.println("Average is " + new Calculate().average(sum2, d - c + 1) + ".");
    System.out.println("Sum of odd of " + c + " to " + d + " is " + new Calculate().oddSumBetween(c, d) + ".");
    System.out.println("Sum of even of " + c + " to " + d + " is " + new Calculate().evenSumBetween(c, d) + ".");
  }
}
