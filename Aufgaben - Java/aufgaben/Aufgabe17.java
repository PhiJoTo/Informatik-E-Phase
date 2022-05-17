package aufgaben;
import java.util.Scanner;

public class Aufgabe17 {

  public static Scanner keyboard = new Scanner(System.in);

  public static void main(String args[]) {
    while (true) {
      System.out.print("Zahl, ab der runtergezählt wird: ");
      int countdownNumber = keyboard.nextInt();
      System.out.print("Zahl, alle wie viel Nummern übersprungen werden sollen: ");
      int skipNumber = keyboard.nextInt();
      if (skipNumber == 0) {
        skipNumber = 1;
      }
      countdown(countdownNumber, skipNumber);
    }

  }

  public static void countdown(int start, int skip) {

    for (int i = start; i >= 0; i -= skip) {
      System.out.println(i);
    }
  }
}
