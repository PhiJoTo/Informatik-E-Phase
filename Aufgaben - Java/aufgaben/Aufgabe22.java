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

    int numberLength = ("" + (number* number)).length();

   for(int x=1; x<=number; x++) {
     for(int y=1; y<=number; y++){

       int calcNumber = x*y;
       String calcString = "" + calcNumber;

     while(calcString.length() < numberLength-1){
        calcString = " " + calcString;
     }
      
         System.out.print(" "+ calcString);
     }
System.out.println();
   }
  }
}
