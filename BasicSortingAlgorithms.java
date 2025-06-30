import java.util.ArrayList;
import java.util.List;

public class BasicSortingAlgorithms {

  public static void selection_sort(int[] arr) {
    for (int i = 0; i <= arr.length - 2; i++) {
      int min = i;
      for (int j = i; j <= arr.length - 1; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      // swap
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }

    // print the sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void bubble_sort(int[] arr) {
    for (int i = arr.length - 1; i >= 1; i--) {
      for (int j = 0; j <= i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    // print the sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void bubble_sort_optimised(int[] arr) {
    for (int i = arr.length - 1; i >= 1; i--) {
      boolean swapsDone = false;
      for (int j = 0; j <= i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapsDone = true;
        }
      }
      if (!swapsDone) {
        System.out.println("No swaps done in this iteration hence stopping");
        break;
      }
    }
    // print the sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void insertion_sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j-1]) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }

    // print the sorted array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();

    int left = low;
    int right = mid+1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      }
      else {
        temp.add(arr[right]);
        right++;
      }
    }
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    for(int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  public static void mergeSort(int[] arr, int low, int high) {
    if (low == high) {
      return;
    }
    int mid = (low + high)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);
    merge(arr, low, mid, high);
  }

  public static void merge_sort(int[] arr) {
    mergeSort(arr, 0, arr.length -1);

    // print the sorted array
    System.out.println("Merge Sort");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int findPartitionIndex(int[] arr, int low, int high) {
    int pivot = low;

    int left = low;
    int right = high;

    while (left < right) {
      while (left <= high && arr[left] <= arr[pivot]) {
        left++;
      }
      while (right >= low && arr[right] >= arr[pivot]) {
        right--;
      }
      if (left < right) {
        // swap and store larger elements to the right of pivot and smaller elements to the left of pivot
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      }
    }
    // swap and store the pivot element at its correct position
    int temp = arr[pivot];
    arr[pivot] = arr[right];
    arr[right] = temp;

    // this is going to be the correct index of pivot element, hence our partition index
    return right;
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partition_index = findPartitionIndex(arr, low, high);
      quickSort(arr, low, partition_index - 1);
      quickSort(arr, partition_index + 1, high);
    }
  }

  public static void quick_sort(int[] arr) {
    quickSort(arr, 0, arr.length -1);

    // print the sorted array
    System.out.println("quick Sort");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = {15, 34, 12, 56, 99, 0, 2, 31, -3};

    selection_sort(arr.clone()); // time complexity -> O(n^2)

    bubble_sort(arr.clone()); // time complexity -> O(n^2)

    int[] arr2 = {1, 2, 3, 4, 5};
    bubble_sort_optimised(arr2); // time complexity -> O(n)

    insertion_sort(arr.clone()); // time complexity -> O(n^2)
    merge_sort(arr.clone()); // time complexity -> O(n log n)

    quick_sort(arr.clone());
  }
}
