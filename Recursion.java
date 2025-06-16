import java.util.Arrays;

public class Recursion {

  public static void printNameN_Times(int n) {
    if (n < 1) {
      return;
    }
    System.out.print("Prakash ");
    printNameN_Times(n - 1);
  }

  public static void printLinearlyFrom_1_to_N(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.print(i + " ");
    printLinearlyFrom_1_to_N(i + 1, n);
  }

  public static void printLinearlyFrom_N_to_1(int n) {
    if (n < 1) {
      return;
    }
    System.out.print(n + " ");
    printLinearlyFrom_N_to_1(n - 1);
  }

  public static void printLinearlyFrom_1_to_N_without_using_addition(int n) {
    if (n < 1) {
      return;
    }
    printLinearlyFrom_1_to_N_without_using_addition(n- 1);
    System.out.print(n + " ");
  }

  public static void printLinearlyFrom_N_to_1_without_using_substraction(int i, int n) {
    if (i > n) {
      return;
    }

    printLinearlyFrom_N_to_1_without_using_substraction(i + 1, n);
    System.out.print(i + " ");
  }

  public static void sum_of_first_n_numbers(int n, int sum) {
    if (n < 1) {
      System.out.println(sum);
      return;
    }
    sum_of_first_n_numbers(n - 1, sum + n);
  }

  public static int sum_of_first_n_numbers_with_return_value(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum_of_first_n_numbers_with_return_value(n - 1);
  }

  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return n * factorial(n-1);
  }

  public static int[] reverse_array_using_recursion(int [] arr, int l, int r) {
    if (l >= r) {
      return arr;
    }

    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    return reverse_array_using_recursion(arr, l + 1, r - 1);
  }

  public static int[] reverse_array_using_recursion_using_one_pointer(int []arr, int i, int n) {
    if (i > n/2) {
      return arr;
    }

    int temp = arr[i];
    arr[i] = arr[n - i -1];
    arr[n - i -1] = temp;

    return reverse_array_using_recursion_using_one_pointer(arr, i + 1, n);
  }

  public static boolean check_palindrome_string(String s, int i, int n) {
    if (i >= n/2) {
      return true;
    }
    if (s.charAt(i) == s.charAt(n-i-1)) {
      return check_palindrome_string(s, i+1, n);
    }
    else {
      return false;
    }
  }

  public static int fibonacci_number(int n) {
    if ( n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return fibonacci_number(n-1) + fibonacci_number(n - 2);
  }

  public static void main(String[] args) {
    printNameN_Times(5);
    System.out.println();
    printLinearlyFrom_1_to_N(1, 5);
    System.out.println();
    printLinearlyFrom_N_to_1(5);
    System.out.println();
    printLinearlyFrom_1_to_N_without_using_addition(5);
    System.out.println();
    printLinearlyFrom_N_to_1_without_using_substraction(1, 5);
    System.out.println();
    sum_of_first_n_numbers(5, 0);

    System.out.println(sum_of_first_n_numbers_with_return_value(5));
    System.out.println(factorial(5));

    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Reversed Array: " + Arrays.toString(reverse_array_using_recursion(arr, 0, arr.length - 1)));
    int[] arr2 = {7, 8, 9, 4, 3};
    System.out.println("Reversed Array: " + Arrays.toString(reverse_array_using_recursion_using_one_pointer(arr2, 0, arr2.length)));
    String s = "MADAME";
    System.out.println(check_palindrome_string(s, 0, s.length()) ? "Palindrome" : "Not Palindrome");

    System.out.println("8th Fibonacci number : " + fibonacci_number(8));
  }
}
