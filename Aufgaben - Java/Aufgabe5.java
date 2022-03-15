
import java.util.Scanner;

public class Aufgabe5 {
  public static Scanner keyboard = new Scanner(System.in);

  /**
   * @param args[]
   */
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
      System.out.println("Um zu prüfen, ob eine Zahl durch 5 teilbar ist: '4'");
      System.out.println("Um die Nullstellen mithilfe der pq-Formel zu berechnen: '5'");

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
        case 4:
          isDivisibleBy5();
          ;
        case 5:
          zeroPoints();
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

  // a function that proves if a number can be divided by 5 without a rest
  public static void isDivisibleBy5() {
    int number;
    System.out.println("Gib eine Zahl ein: ");
    number = keyboard.nextInt();
    if (number % 5 == 0) {
      System.out.println("Die Zahl " + number + " kann ohne Rest durch 5 geteilt werden.");
    } else {
      System.out.println("Die Zahl " + number + " kann ohne Rest nicht durch 5 geteilt werden.");
    }
  }

  // function that calculates zero points using the pq formula
  public static void zeroPoints() {

    // keyboard input for p and q
    System.out.println("Gib p ein: ");
    double p = keyboard.nextDouble();
    System.out.println("Gib q ein: ");
    double q = keyboard.nextDouble();

    // calculation of the zero points
    double x1 = -p / 2 + Math.sqrt((p * p) / 4 - q);
    double x2 = -p / 2 - Math.sqrt((p * p) / 4 - q);

    if (!Double.isNaN(x1)) {
      System.out.println("x1: " + x1);
    }
    if (!Double.isNaN(x2)) {
      System.out.println("x2: " + x2);
    } else if (Double.isNaN(x1) && Double.isNaN(x2)) {
      System.out.println("Es gibt keine Nullstellen.");
    }
  }
}
