package aufgaben;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aufgabe13u14 {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    // array of ints
    List<Integer> numberArray = new ArrayList<Integer>();
    // keyboard input
    String inputString = keyboard.nextLine();
    // split input string into array of strings
    String[] inputArray = inputString.split(" ");
    // convert array of strings to array of ints
    for (int i = 0; i < inputArray.length; i++) {
      numberArray.add(Integer.parseInt(inputArray[i]));
    }

    System.out.println(maxNumber(numberArray));
  }

  public static int maxNumber(List<Integer> numbers) {
    int maxNumber = 0;
    for (int number : numbers) {
      maxNumber = maxNumber < number ? number : maxNumber;
    }

    return maxNumber;
  }

}