package Algorithms;

public class Recursion {

  private static int factorialCalc(int n){
    if (n <= 1)
      return 1;
    else
      return n * factorialCalc(n-1);


  }

  private static int regressiveSum(int number) {
    if (number <= 1)
      return 1;
    else
      return number + regressiveSum(number -1);

  }

  private static String stringReverse(String word, int position) {
    if (position < 0)
      return "";
    else
      return word.charAt(position) + stringReverse(word,position-1);

  }

  private static int counting(int number) {
    System.out.printf("%d ", number);

    if (number <= 1)
      return 1;
    else
      return counting(number - 1);

  }

  public static void main(String[] args) {
    int factorial = 3;
    System.out.printf("Fatorial de %d -> %d%n", factorial, factorialCalc(factorial));

    int regressiveNumber = 3;
    System.out.printf("Soma regressiva de %d -> %d%n", regressiveNumber,regressiveSum(regressiveNumber));

    String word = "maratona";
    System.out.printf("String %s, reverse -> %s%n", word, stringReverse(word,word.length()-1));

    int countingNumber = 5;
    System.out.printf("Counting %d -> %d%n", countingNumber, counting(countingNumber));




  }
}
