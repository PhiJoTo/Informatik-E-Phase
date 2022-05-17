package aufgaben;
import java.util.Scanner;

/**
 * Aufgabe 15
 */
public class Aufgabe15 {

  static Scanner keboard = new Scanner(System.in);

  public static void main(String args[]) {
    while (true) {
      System.out.println("Geben Sie eine Jahreszahl ein: ");
      int year = keboard.nextInt();
      System.out.println("Ostern ist im Jahr " + year + " am " + easternDate(year));
    }
  }

  public static String easternDate(int year) {
    int m, n;
    m = 0;
    n = 0;
    int yearDivided = year / 100;
    switch (yearDivided) {
      case 17:
        m = 23;
        n = 3;
        break;
      case 18:
        m = 23;
        n = 4;
        break;
      case 19:
        m = 24;
        n = 5;
        break;
      case 20:
        m = 24;
        n = 5;
        break;
      case 21:
        m = 24;
        n = 6;
        break;
    }
 
    if (m == 0 || n == 0) {
      return "Fehler bei der Berechnung";
    }
    int a, b, c, d, e;
    a = year % 19;
    b = year % 4;
    c = year % 7;
    d = (19 * a + m) % 30;
    e = (2 * b + 4 * c + 6 * d + n) % 7;
    int march = 22 + d + e;
    int april = d + e - 9;

    april = april == 26 ? april - 7 : (april == 25 && a > 10) ? april - 8 : april;
    System.out.println(march + " " + april);

    boolean couldBeMarch = false;
    boolean couldBeApril = false;

    if (march < 32 && march > 0) {
      couldBeMarch = true;
    }
    if (april < 31 && april > 0) {
      couldBeApril = true;
    }

    if (couldBeApril && couldBeMarch) {
      return april + " April" + ", oder am " + march + " März.";
    } else if (couldBeApril) {
      return april + " April" + ".";
    } else if (couldBeMarch) {
      return march + " März.";
    } else {
      return "In dem Jahr gibt es kein Ostern, oder es gab einen Fehler.";
    }

  }
}


// public class Ostern {

//   public static void osterBerechnung(int j) {
//     int m, a, b, c, d, e, tag, n = 4;
//     String monat = new String();
//     if (j >= 1900)
//       m = 24;
//     else
//       m = 23;
//     if (j >= 1900)
//       n = 5;
//     if (j >= 2100)
//       n = 6;
//     a = j % 19;
//     b = j % 4;
//     c = j % 7;
//     d = (19 * a + m) % 30;
//     e = (2 * b + 4 * c + 6 * d + n) % 7;
//     if (22 + d + e > 31) {
//       tag = d + e - 9;
//       monat = "April";
//     } else {
//       tag = 22 + d + e;
//       monat = "März";
//     }
//     if (22 + d + e - 31 == 26)
//       tag = 19;
//     if ((22 + d + e - 31 == 26) && (a > 10))
//       tag = 18;
//     System.out.println("Ostern ist im Jahr " + j + " am " + tag + ". " + monat);
//   }

//   public static void main(String[] args) {
//     for (int i = 2010; i < 2025; i++)
//       osterBerechnung(i);
//   }

// }
