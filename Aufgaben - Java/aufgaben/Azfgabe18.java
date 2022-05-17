package aufgaben;
import java.util.Scanner;

public class Azfgabe18 {
  public static void main(String[] args) {
    try (// keyboard input
    Scanner keyboard = new Scanner(System.in)) {
      System.out.println("Von welcher Zahl soll die Fakuktät berechnet werden: ");
      int fakultaetNumber = keyboard.nextInt();
      int origNumber = fakultaetNumber;
      for (int i = fakultaetNumber -1; i!= 1; i--) {
        fakultaetNumber = fakultaetNumber * i;
 }
 System.out.println("Die Fakultät von " + origNumber + " ist: " + fakultaetNumber);
    }
  }
}