
import java.util.Scanner;

public class Aufgabe10 {
  public static Scanner keyboard = new Scanner(System.in);

  public static void main(String args[]) {
    while (true) {
      System.out.println("Der wievielte Monat soll ausgegeben werden?");
      try {
        System.out.println(monatsname(keyboard.nextInt()));
      } catch (Exception e) {
        System.out.println("Ein Fehler ist aufgetreten, versuche es erneut. Achte darauf nur Zahlen einzugeben.");
      }

      System.out.println("----------------------------------");
    }

  }

  public static String monatsname(int monat) {

    String monatsname = "";
    String[] monate = { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober",
        "November", "Dezember" };
    monatsname = monate[monat - 1];
    return monatsname;

  }
}
