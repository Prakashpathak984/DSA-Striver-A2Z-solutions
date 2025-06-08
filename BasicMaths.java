import java.util.ArrayList;
import java.util.List;

public class BasicMaths {

  public static int extractLastDigit(int number) {
    return number%10;
  }

  public static void extractAllDigitsFromNumber(int number) {
    while(number > 0) {
      System.out.println(extractLastDigit(number));
      number /= 10;
    }
  }

  public static void countDigitsInNumber(int number) {
    int count = 0;
    while(number > 0) {
      count++;
      number /= 10;
    }
    System.out.println("Number of digits in the number: " + count);
  }

  public static void reverseNumber(int num) {
    int rev = 0;
    while(num > 0) {
      rev = (rev * 10) + extractLastDigit(num);
      num /= 10;
    }
    System.out.println("Reversed number: " + rev);
  }

  public static void isPlaindrome(int num) {
    int rev = 0;
    int number = num; // Store original number for comparison
    while (num > 0) {
      rev = (rev * 10) + extractLastDigit(num);
      num /= 10;
    }
    System.out.println( "Is Palindrome : " + (rev == number));
  }

  public static void isArmstrong(int num) {
    int sum = 0;
    int number = num; // Store original number for comparison

    while(num > 0) {
      sum += Math.pow(extractLastDigit(num), 3);
      num /= 10;
    }

    System.out.println("Is Armstrong : " + (sum == number));
  }

  public static void printAllDivisors(int num) {
    System.out.print("Divisors of " + num + ": ");
    for(int i = 1; i <= num; i++) {
      if(num % i == 0) {
        System.out.print(i + " ");
      }
    }
  }

  public static void printAllDivisors_betterSolution(int num) {
    System.out.print("Divisors of " + num + ": ");
    System.out.print(1 + " ");
    for(int i = 2; i <= num/2; i++) {
      if(num % i == 0) {
        System.out.print(i + " ");
      }
    }
    if (num > 1)
      System.out.print(num); // num is also a divisor of itself
  }

  /**
   * Optimal solution to find divisors
   * only if the order of divisors is not important
   * else you can store them in a list and sort them later
   * This method runs in O(sqrt(n)) time complexity
   */
  public static void printAllDivisors_optimalSolution(int num) {
    System.out.print("Divisors of " + num + ": ");
    for(int i = 1; i * i <= num; i++) {
      if(num % i == 0) {
        System.out.print(i + " ");
        if(i != num / i ) {
          System.out.print(num / i + " ");
        }
      }
    }
  }

  public static void checkPrime(int num) {
    List<Integer> factors = new ArrayList<>();
    if(num < 2) {
      System.out.println(num + " is not a prime number.");
      return;
    }
    for(int i = 1; i * i <= num; i++) {
      if(num % i == 0) {
        factors.add(i);
        if(i != num / i) {
          factors.add(num / i);
        }
      }
    }
    if (factors.size() == 2 && factors.get(0) == 1 && factors.get(1) == num) {
      System.out.println(num + " is a prime number.");
    }
  }

  public static void GCD(int a, int b) {
    int gcd = 1;
    int min = Math.min(a,b);
    for( int i = 2; i < min; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    System.out.println("GCD: " + gcd);
  }

  public static void GCD_betterSolution(int a, int b) {
    int gcd = 1;
    int min = Math.min(a,b);
    for( int i = min; i > 1; i--) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
        break; // Found the GCD, no need to check further
      }
    }
    System.out.println("GCD: " + gcd);
  }

  /**
   * This method uses the Euclidean algorithm to find the GCD of two numbers.
   * GCD(a, b) = GCD(a - b, b) if a > b
   * further simplified to GCD(a, b) = GCD(b, a % b)
   */
  public static void GCD_euclideanAlgorithm(int a, int b) {
    while (a > 0 && b > 0) {
      if (a > b) {
        a = a % b; // Reduce a
      } else {
        b = b % a; // Reduce b
      }
    }
    if (a == 0) {
      System.out.println("GCD: " + b); // If a is reduced to 0, GCD is b
    } else {
      System.out.println("GCD: " + a); // If b is reduced to 0, GCD is a
    }
  }

  public static void main(String[] args) {
    extractAllDigitsFromNumber(7789);
    countDigitsInNumber(7786005);
    reverseNumber(123456789);
    reverseNumber(123000);
    isPlaindrome(12);
    isArmstrong(372);
    printAllDivisors(36);
    System.out.println();
    printAllDivisors_betterSolution(1);
    System.out.println();
    printAllDivisors_optimalSolution(36);
    System.out.println();

    checkPrime(13);
    GCD(12,20);
    GCD_betterSolution(12,20);
    GCD_euclideanAlgorithm(12,20);
  }
}
