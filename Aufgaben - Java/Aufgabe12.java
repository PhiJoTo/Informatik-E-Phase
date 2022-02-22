import java.util.Scanner;

public class Aufgabe12 {

  public static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("Gib deinen jetzigen Lohn ein:");
      System.out.print("Dein Lohn: ");
      int alterLohn = keyboard.nextInt();
      System.out.println("Dein neuer Lohn beträgt: " + neuerLohn(alterLohn));
      System.out.println("----------------------------------");
    }

  }

  public static int neuerLohn(int alterLohn) {
    int lohnNeu = 0;
    if ((alterLohn / 100 * 103) <= (alterLohn + 200)) {
      lohnNeu = alterLohn + 200;
    } else {
      lohnNeu = alterLohn / 100 * 103;
    }
    return lohnNeu;
  }
}
