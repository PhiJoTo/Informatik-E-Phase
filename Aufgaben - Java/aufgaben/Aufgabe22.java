package aufgaben;
import java.util.Scanner;




public class Aufgabe22 {

//keyboard input scanner
  public static Scanner keyboard = new Scanner(System.in);


  public static void main(String[] args) {

    

    System.out.print("Gib die Zahl ein, von der das Einmaleins ausgegeben werden soll: ");
    double number = keyboard.nextInt();
    einmaleins(number);

  }

  public static void einmaleins(double number) {
    for (int i = 1; i <= number; i++) {
      System.out.println( number + " * "+ i + ": " + (number * i));
    }
  }
}
