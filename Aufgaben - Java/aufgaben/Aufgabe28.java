package aufgaben;

import java.util.ArrayList;

/**
 * Aufgabe28
 */
public class Aufgabe28 {

  public static ArrayList<Integer> moneyWonByDifferentPlayers = new ArrayList<>();
  public static void main(String[] args) {

    int highestWin = 0;
    int highestLoss = 0;
    int numberOfRounds = 7000;


  for (int i = 0; i < numberOfRounds; i++) {
    int currentMoney = moneyWonByPlayer(40);
    if (currentMoney > highestWin) {
      highestWin = currentMoney;
    }
    if (currentMoney < highestLoss) {
      highestLoss = currentMoney;
    }
    moneyWonByDifferentPlayers.add(currentMoney);
    System.out.println(currentMoney);
    
  }
    System.out.println("Auswertung:");
    System.out.println("Höchste Gewinn: " + highestWin);
    System.out.println("Höchste Verlust: " + highestLoss);
    System.out.println("Number of Games: " + moneyWonByDifferentPlayers.size());
    System.out.println("Average: " + average());
    System.out.println("Bilanz pro Jahr fürs Casino in Euro: " + (-1 * moneyWonOverYear()));

  }


public static double moneyWonOverYear(){
  double sum = 0;
  for (int i = 0; i < moneyWonByDifferentPlayers.size(); i++) {
    sum += moneyWonByDifferentPlayers.get(i);
  }
  return sum;
}

public static double average() {


return moneyWonOverYear() / moneyWonByDifferentPlayers.size();
}



  public static int game() {
    int matches = 0;
    int guess = getRandomBet();
    for (int i = 0; i < 3; i++) {
      int dice = randomDice();
      if (dice == guess) {
        matches++;
      }

    }
    return matches;
  }

  public static int randomDice() {
    int randomNumber = (int) (Math.random() * 6) + 1;
    return randomNumber;
  }

  public static int getRandomBet() {
    int randomBet = (int) (Math.random() * 3) + 1;
    return randomBet;
  }

  public static int moneyWonByPlayer(int numberOfGames) {
    int timesZero = 0;
    int timesOne = 0;
    int timesTwo = 0;
    int timesThree = 0;

    for (int i = 0; i < numberOfGames; i++) {
      int currentWin = game();
      switch (currentWin) {
        case 0:
          timesZero++;
          break;
        case 1:
          timesOne++;
          break;
        case 2:

          timesTwo++;
          break;
        case 3:

          timesThree++;
          break;
      }
    }
     
    int winLoss = 0 + (timesZero * -1) + (timesOne * 1) + (timesTwo * 2) + (timesThree * 5);

    // System.out.println("Auswertung:");
    // System.out.println("Number of games: " + numberOfGames);
    // System.out.println("Times 0: " + timesZero);
    // System.out.println("Times 1: " + timesOne);
    // System.out.println("Times 2: " + timesTwo);
    // System.out.println("Times 3: " + timesThree);
    // System.out.println("-------------");
    // System.out.println("Der Spieler hat " + winLoss+ " Euro gewonnen.");
    
return winLoss;

  }

}