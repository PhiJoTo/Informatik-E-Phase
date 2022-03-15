import java.util.Scanner;

/**
 * Aufgabe19
 */
public class Aufgabe19 {

  public static String year = "";
  public static void main(String[] args) {
    try (//keyboard input for year
    Scanner keyboard = new Scanner(System.in)) {
      System.out.println("Gib ein Jahr ein: ");
         year = keyboard.next();
    }
    String[] monate = {
      "Januar",
      "Februar",
      "März",
      "April",
      "Mai",
      "Juni",
      "Juli",
      "August",
      "September",
      "Oktober",
      "November",
      "Dezember"
  };
  int[] monthDays = {
    31,
    28,
    31,
    30,
    31,
    30,
    31,
    31,
    30,
    31,
    30,
    31
  };
  for(int i=0; i < monthDays.length; i++) {
    
    int element = monthDays[i];
    for (int i2 = 0; i2 < element ; i2++) {
      System.out.println(i2+1 + ". " + monate[i] + " " + year );
    }
}
  }
}