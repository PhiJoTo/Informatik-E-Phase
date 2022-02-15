import java.util.Scanner;

public class Aufgabe5 {
  public static Scanner keyboard = new Scanner(System.in);

  public static void main(String args[]) {
    whileTrue();
  }

  public static void whileTrue() {
    while (true) {
      int chosenFunction;

      System.out.println("Welche Funktion möchtest du ausführen?");
      System.out.println("Um einen Kreis zu berechnen wähle: '1'");
      System.out.println("Um 2 Zahlen zu verrechnen wähle: '2'");
      System.out.println("Um eine Zufallszahl zu berechnen wähle: '3'");

      chosenFunction = keyboard.nextInt();
      switch (chosenFunction) {
        case 1:
          kreis();
          ;
        case 2:
          ints();
          ;
        case 3:
          randomInt();
          ;
      }
      System.out.println("----------------------------------");
      System.out.println("----------------------------------");
    }
  }

  // Funktion, die mit einem gegebenen Radius verschiedene Werte eines Kreises
  // berechnet und ausgibt.
  public static void kreis() {
    double r;
    double d;
    double u;
    double a;

    System.out.println("Gib einen Radius ein: ");
    r = keyboard.nextDouble();
    d = 2 * r;
    u = d * Math.PI;
    a = Math.PI * r * r;
    System.out.println("Radius: " + r);
    System.out.println("Durchmesser: " + d);
    System.out.println("Umfang: " + u);
    System.out.println("Flächeninhalt: " + a);
  }

  // Funktion, die 2 Zahlen zu einer Summe, einer Differenz, einem Produkt und
  // einem Quotienten verrechnet
  public static void ints() {
    int a;
    int b;
    System.out.println("Gib den ersten Wert ein: ");
    a = keyboard.nextInt();
    System.out.println("Gib den zweiten Wert ein: ");
    b = keyboard.nextInt();
    System.out.println("Summe: " + (a + b));
    System.out.println("Differenz: " + (a - b));
    System.out.println("Produkt: " + (a * b));
    System.out.println("Quotient: " + (float) (a / b));
  }

  public static void randomInt() {
    int randomInt;
    randomInt = (int) (Math.random() * 100);
    System.out.println("Deine Zufallszahl ist: " +
        randomInt);
  }
}
