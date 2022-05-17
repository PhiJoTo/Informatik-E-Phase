package aufgaben;

import java.util.Calendar;

public class Aufgabe26 {

  public static double startingMoney = 2000;
  public static double interestRate = 3;
  public static int yearlyDeposit = 1500;
  public static int year = Calendar.getInstance().get(Calendar.YEAR);

public static void main(String[] args) {
  form(132);
  System.out.println();

  yearsCalculater(1000000);
  System.out.println();
  neededInterestCalculator(1000000, 60);
}

public static void form(int years) {
  double currentMoney = startingMoney;
 for(int i=0; i<years + 1; i++){
   System.out.println(year + i + " (+" + i + "): " + currentMoney + " Euro.");
   currentMoney = ((currentMoney + yearlyDeposit)/100*103);}
}

//how long does it take to become a millionaire
public static void yearsCalculater(int goal){
  int years = 0;
  double currentMoney = startingMoney;
  while(currentMoney<goal){
    currentMoney = ((currentMoney + yearlyDeposit)/100*103);
    years++;
  }
  System.out.println("It takes " + years + " years to reach the goal of " + goal + " Euro.");
}

public static void neededInterestCalculator(int goal, int years){

  int calculatedMaxEarning = 0;
  int currentInterest = 0;

  while(calculatedMaxEarning < goal){
    calculatedMaxEarning = 0;
   for(int i = 0; i< years; i++){
      calculatedMaxEarning = ((calculatedMaxEarning + yearlyDeposit)/100*(100 + currentInterest));
   
   }
  
   currentInterest++;
  }
  System.out.println("Der benötigte Zinssatz um das gewünschte Zeil von " + goal + " Euro  in "+ years + " Jahren zu erreichen ist " + (currentInterest -1) + " %.");
}

}


