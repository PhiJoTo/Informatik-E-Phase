import java.util.Scanner;

public class Aufgabe4Kreise {
  public static double r;
  public static double d;
  public static double u;
  public static double a;
  public static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Gib einen Radius ein: ");
    r = keyboard.nextDouble();
    d = 2 * r;
    u = d * Math.PI;
    a = Math.PI * r * r;
    System.out.println("Radius: " + r);
    System.out.println("Durchmesser: " + d);
    System.out.println("Umfang: " + u);
    System.out.println("Flächeninhalt" + a);
  }

}