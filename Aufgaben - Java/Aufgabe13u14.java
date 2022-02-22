public class Aufgabe13u14 {
  public static void main(String[] args) {
    System.out.println(maxNumber(int[]));
  }

  public static int maxNumber(int[] numbers) {
    int maxNumber = 0;
    for (int number : numbers) {
      maxNumber = maxNumber < number ? number : maxNumber;

    }

    return maxNumber;
  }

}