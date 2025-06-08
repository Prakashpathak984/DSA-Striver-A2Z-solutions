
public class Patterns {

  /*
         * * *
         * * *
         * * *
         * * *
   */
  public static void pattern1 (int n) {
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 4; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
         *
         * *
         * * *
         * * * *
   */
  public static void pattern2 (int n) {
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
        1
        1 2
        1 2 3
        1 2 3 4
   */
  public static void pattern3 (int n) {
    for (int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /*
        1
        2 2
        3 3 3
        4 4 4 4
   */
  public static void pattern4 (int n) {
    for (int i = 1; i <= n; i++){
      for(int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  /*
     * * * * *
     * * * *
     * * *
     * *
     *
   */
  public static void pattern5 (int n) {
    for (int i = n; i > 0; i--){
      for(int j = i; j > 0; j--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
      1 2 3 4
      1 2 3
      1 2
      1
   */
  public static void pattern6 (int n) {
    for (int i = n; i > 0; i--){
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /*
              *
            * *
          * * *
        * * * *
      * * * * *
   */
  public static void pattern7 (int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
   */
  public static void pattern8 (int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j > i; j--) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("* ");
      }
      for (int l = 1; l < i; l++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
      * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
   */
  public static void pattern9 (int n) {
    for (int i = n; i > 0; i--) {
      for (int j = n; j > i; j--) {
        System.out.print("  ");
      }
      for (int k = i; k > 0; k--) {
        System.out.print("* ");
      }
      for( int l = i; l > 1; l--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
   */
  public static void pattern10 (int n) {
    pattern8(n);
    pattern9(n);
  }

  /*
       *
       * *
       * * *
       * * * *
       * * * * *
       * * * *
       * * *
       * *
       *
   */
  public static void pattern11 (int n) {
    pattern2(n);
    pattern5(n-1);
  }

  /*
      1
      0 1
      1 0 1
      0 1 0 1
      1 0 1 0 1
   */
  public static void pattern12 (int n) {
    for (int i = 0; i < n; i++) {
      int flag = i%2 == 0 ? 1 : 0;
      for (int j = 0; j <= i; j++) {
        System.out.print(flag + " ");
        flag = 1 - flag;
      }
      System.out.println();
    }
  }

  /*
      1                 1
      1 2             2 1
      1 2 3         3 2 1
      1 2 3 4     4 3 2 1
      1 2 3 4 5 5 4 3 2 1
   */
  public static void pattern13 (int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      for (int k = (2 * n) - (2 * i); k > 0; k--) {
        System.out.print("  ");
      }
      for (int l = i; l > 0; l--) {
        System.out.print(l + " ");
      }
      System.out.println();
    }
  }

  /*
      1
      2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15
   */
  public static void pattern14 (int n) {
    int num = 1;
    for(int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  /*
      A
      A B
      A B C
      A B C D
      A B C D E
   */
  public static void pattern15 (int n) {
    for (int i = 0; i < n; i++) {
      char c = 'A';
      for (int j = 0; j <= i; j++) {
        System.out.print(c + " ");
        c++;
      }
      System.out.println();
    }
  }

  /*
      A B C D E
      A B C D
      A B C
      A B
      A
   */
  public static void pattern16 (int n) {
    for (int i = 0; i < n; i++) {
      char c = 'A';
      for (int j = n; j > i; j--) {
        System.out.print(c + " ");
        c++;
      }
      System.out.println();
    }
  }

  /*
      A
      B B
      C C C
      D D D D
      E E E E E
   */
  public static void pattern17 (int n) {
    char c = 'A';
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(c + " ");
      }
      System.out.println();
      c++;
    }
  }

  /*
              A
            A B A
          A B C B A
        A B C D C B A
      A B C D E D C B A
   */
  public static void pattern18 (int n) {
    for (int i = 0; i < n; i++) {
      char c = 'A';
      for (int j = 0; j < n - i; j++) {
        System.out.print("  ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(c++ + " ");
      }
      c--;
      for (int l = 0; l < i; l++) {
        System.out.print(--c + " ");
      }
      System.out.println();
    }
  }

  /*
      E
      D E
      C D E
      B C D E
      A B C D E
   */
  public static void pattern19 (int n) {
    for (int i = 1; i <= n; i++) {
      char c = (char)('A' + n - i);
      for (int j = 1; j <= i; j++) {
        System.out.print(c++ + " ");
      }
      System.out.println();
    }
  }

  /*
       *                 *
       * *             * *
       * * *         * * *
       * * * *     * * * *
       * * * * * * * * * *
   */
  public static void pattern20 (int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for (int k = (2 * n) - (2 * i); k > 0; k--) {
        System.out.print("  ");
      }
      for (int l = i; l > 0; l--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
       * * * * * * * * * *
       * * * *     * * * *
       * * *         * * *
       * *             * *
       *                 *
   */
  public static void pattern21 (int n) {
    for (int i = 0; i < n; i++) {
      for(int j = n; j > i; j--) {
        System.out.print("* ");
      }
      for(int k = 0; k < 2 * i; k++) {
        System.out.print("  ");
      }
      for(int l = n; l > i; l--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
       * * * * * * * * * *
       * * * *     * * * *
       * * *         * * *
       * *             * *
       *                 *
       *                 *
       * *             * *
       * * *         * * *
       * * * *     * * * *
       * * * * * * * * * *
   */
  public static void pattern22 (int n) {
    pattern21(n);
    pattern20(n);
  }

  /*
       *                 *
       * *             * *
       * * *         * * *
       * * * *     * * * *
       * * * * * * * * * *
       * * * *     * * * *
       * * *         * * *
       * *             * *
       *                 *
   */
  public static void pattern23 (int n) {
    pattern20(n);
    for (int i = 1; i < n; i++) {
      for(int j = n; j > i; j--) {
        System.out.print("* ");
      }
      for(int k = 0; k < 2 * i; k++) {
        System.out.print("  ");
      }
      for(int l = n; l > i; l--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /*
       * * * * *
       *       *
       *       *
       *       *
       * * * * *
   */
  public static void pattern24 (int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n-1 || j == 0 || j == n-1)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }

  /*
      4 4 4 4 4 4 4
      4 3 3 3 3 3 4
      4 3 2 2 2 3 4
      4 3 2 1 2 3 4
      4 3 2 2 2 3 4
      4 3 3 3 3 3 4
      4 4 4 4 4 4 4
   */
  public static void pattern25 (int n) {
    for(int i = 0; i < 2 * n - 1; i++) {
      int num = n;
      for (int j = 0; j < 2 * n - 1; j++) {
        System.out.print(num + " ");
        if (j < i)
          num--;
        if ( i + j >= 2 * n - 2)
          num++;
      }
      System.out.println();
    }
  }

  public static void pattern25_Solution_2 (int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2* n - 1; j++) {
        // The minimum distance from the current position to any edge
        // is the minimum of the four distances to the edges
        // (i, j) to (0, 0), (0, n-1), (n-1, 0), and (n-1, n-1)
        // The value at (i, j) is n - min(i, j, n-i-1, n-j-1)
        int top = i;
        int bottom = 2* n - 2 - i;
        int left = j;
        int right = 2* n - 2 - j;
        int min = Math.min(Math.min(top, bottom), Math.min(left, right));
        // The value at (i, j) is n - min
        System.out.print((n - min) + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {

    System.out.println("pattern 1");
    pattern1(4);
    System.out.println("pattern 2");
    pattern2(4);
    System.out.println("pattern 3");
    pattern3(4);
    System.out.println("pattern 4");
    pattern4(4);
    System.out.println("pattern 5");
    pattern5(5);
    System.out.println("pattern 6");
    pattern6(4);
    System.out.println("pattern 7");
    pattern7(5);
    System.out.println("pattern 8");
    pattern8(5);
    System.out.println("pattern 9");
    pattern9(5);
    System.out.println("pattern 10");
    pattern10(5);
    System.out.println("pattern 11");
    pattern11(5);
    System.out.println("pattern 12");
    pattern12(5);
    System.out.println("pattern 13");
    pattern13(5);
    System.out.println("pattern 14");
    pattern14(5);
    System.out.println("pattern 15");
    pattern15(5);
    System.out.println("pattern 16");
    pattern16(5);
    System.out.println("pattern 17");
    pattern17(5);
    System.out.println("pattern 18");
    pattern18(5);
    System.out.println("pattern 19");
    pattern19(5);
    System.out.println("pattern 20");
    pattern20(5);
    System.out.println("pattern 21");
    pattern21(5);
    System.out.println("pattern 22");
    pattern22(5);
    System.out.println("pattern 23");
    pattern23(5);
    System.out.println("pattern 24");
    pattern24(5);
    System.out.println("pattern 25");
    pattern25(4);
    System.out.println("pattern 25 Solution 2");
    pattern25_Solution_2(4);
  }
}
