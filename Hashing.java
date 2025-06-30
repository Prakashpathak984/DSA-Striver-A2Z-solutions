import java.util.HashMap;
import java.util.Map;

public class Hashing {

  public static int count_of_character(int[] arr, int n) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    int arr[] = {1, 5, 3, 5, 6, 2, 1};

    // to find the frequency of 1
    System.out.println(count_of_character(arr, 1)); // time complexity O(n)

    /**
     * Now suppose we are making Q number of queries to find frequency
     * in that case the time complexity of the whole program -> O( Q * n )
     *
     * lets suppose Q = 10^5
     *
     * in this case the time complexity of whole program is O( 10^5 * n )
     *
     * this is impractical. hence we use Hashing
     */

    // size of hash = max characters + 1

    // Here we are assuming max number in the array could be 12, hence hash size = 13
    int[] hash = new int[13];

    int[] array = {1, 3, 5, 2, 1, 3, 1, 4, 4, 7, 10, 9};

    //pre compute
    for (int i = 0; i < array.length; i++) {
      hash[array[i]]++;
    }

    // time complexity of pre compute is O(n)

    // now to find frequency of any number in this array
    System.out.println(hash[5]);
    System.out.println(hash[1]);
    System.out.println(hash[4]);
    System.out.println(hash[12]); // time complexity of each search -> O(1)


    // hence the time complexity of whole program O(n)


    /**
     * Character Hashing
     */

    // alphabets hashing ->here we assume all chars are lowercase alphabets

    int[] char_hash = new int[26];

    String s = "prakash";

    // pre compute
    for(int i = 0; i < s.length(); i++) {
      char_hash[s.charAt(i) - 'a']++;
    }

    // time complexity of pre compute is O(n)

    // to find frequency of any alphabet in this string
    System.out.println(char_hash['a' - 'a']);
    System.out.println(char_hash['p' - 'a']);
    System.out.println(char_hash['z' - 'a']);


    /**
     * Character hashing for all ASCII chars
     */

    int[] char_hash2 = new int[256];

    String s2 = "Prakash Pathak - SDE 1 at Amadeus Labs india ltd.";

    // pre compute
    for (int i = 0; i < s2.length(); i++) {
      char_hash2[s2.charAt(i)]++ ;
    }

    // now to find frequency of any character

    System.out.println(char_hash2['i']);
    System.out.println(char_hash2['P']);
    System.out.println(char_hash2['p']);
    System.out.println(char_hash2[';']);
    System.out.println(char_hash2[' ']);


    /**
     * Hashing using maps instead of arrays
     */

    Map<Integer, Integer> map_hash = new HashMap<>();

    int[] array_2 = {10, 1, 5, 3, 6, 7, 3, 2, 1, 5, 4, 6, 9, 8, 15, 12, 6};

    // pre compute
    for (int i = 0; i < array_2.length; i++) {
      map_hash.put(array_2[i], map_hash.getOrDefault(array_2[i], 0) + 1);
    }

    // query the hash

    System.out.println(map_hash.getOrDefault(5, 0));
    System.out.println(map_hash.getOrDefault(10, 0));

    /**
     *  Time complexity of operations on Map -> remember this for choosing the map type according to usecase
     *
     *
     *  | Operation         | `HashMap`             | `TreeMap`    | `LinkedHashMap`        |
     * | ----------------- | --------------------- | ------------ | ---------------------- |
     * | Insert (`put`)    | O(1) avg / O(n) worst | O(log n)     | O(1) avg               |
     * | Get (`get`)       | O(1) avg / O(n) worst | O(log n)     | O(1) avg               |
     * | Remove            | O(1) avg / O(n) worst | O(log n)     | O(1) avg               |
     * | Ordered Iteration | No                    | Yes (sorted) | Yes (insertion/access) |
     */

    // print all elements in map
    for (Map.Entry<Integer, Integer> i : map_hash.entrySet()) {
      System.out.println(i.getKey() + " : " + i.getValue());
    }


    /**
     * To find the highest or lowest frequency element
     */

    int max = 0;
    int maxElement = 0;

    int min = Integer.MAX_VALUE;
    int minElement = 0;
    for (Map.Entry<Integer, Integer> i : map_hash.entrySet()) {
      if (i.getValue() > max) {
        max = i.getValue();
        maxElement = i.getKey();
      }

      if (i.getValue() < min) {
        min = i.getValue();
        minElement = i.getKey();
      }
    }

    System.out.println(String.format("Element %d has highest frequency of %d", maxElement, max));
    System.out.println(String.format("Element %d has lowest frequency of %d", minElement, min));

  }
}
