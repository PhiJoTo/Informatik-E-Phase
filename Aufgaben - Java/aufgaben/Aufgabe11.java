package aufgaben;
import java.util.Scanner;

public class Aufgabe11 {

  public static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println(
          "Gieb zuerst die erreichte Punktzahl ein, dann in der nächsten Zeile die bestmögliche Punktzahl ein.");

      try {
        System.out.print(("Erreichte Punktzahl: "));
        int reached = keyboard.nextInt();
        System.out.print(("Bestmögliche Punktzahl: "));
        int max = keyboard.nextInt();
        System.out.println("Berechnete Note: " + noten(reached, max));
      } catch (Exception e) {
        System.out.println("Ein Fehler ist aufgetreten. Achte darauf nur Zahlen einzugeben.");
      }

      System.out.println("----------------------------------");
    }

  }

  public static int noten(int pointsReached, int pointsMax) {
    int note = 6;
    float grade = (float) pointsReached / pointsMax;
    note = grade >= 0.91 ? 1 : grade >= 0.76 ? 2 : grade >= 0.61 ? 3 : grade >= 0.50 ? 4 : grade >= 0.25 ? 5 : 6;
    return note;
  }

}
