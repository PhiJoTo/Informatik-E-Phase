package aufgaben;
import java.util.Scanner;

public class Aufgabe20 {
  public static void main(String[] args) {
    float x= 1;
    float a= 1;
    float e=2;
    float s=1;
    float y = 0;
    System.out.print("Gib den Anfangswert ein, ab dem die Wertetabelle ausgegeben werden soll: ");
    try (Scanner keyboard = new Scanner(System.in)) {
      a = keyboard.nextFloat();
      System.out.print("Gib den Endwert ein, bis zu dem die Wertetabelle ausgegeben werden soll: ");
      e = keyboard.nextFloat();
      System.out.print("Gib den Schrittweite ein: ");
      s = keyboard.nextFloat();
    }
    // calculating the numbers
    for (x = a; x <= e; x += s) {
      y = ((3*x) * (3*x))-8*x + 4;
      System.out.println(x + " " + y);
    }
  }
}
