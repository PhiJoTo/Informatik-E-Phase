package aufgaben;
public class Aufgabe21 {
  public static void main(String[] args) {
    //Vermutung: Die untere SChleife wird immer öfter ausgeführt bis 5

    //Überprüfung:
      for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
  }
}
