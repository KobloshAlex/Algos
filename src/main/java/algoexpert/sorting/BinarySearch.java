package algoexpert.sorting;

public class BinarySearch {
  public static void main(String[] args) {

    System.out.println(binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 4, 1, 33}, 3));
  }

  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    int left = 0;
    int right = array.length - 1;

    for (int i = 0; i < array.length; i++) {
      int mid = (left + right) / 2;

      if (array[mid] == target) {
        return mid;
      }
      if (array[mid] < target) {
        left = mid + 1;
      } else if (array[mid] > target) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  // recursion
  public static int binarySearchR(int[] array, int target) {
    return binarySearchHelper(array, target, 0, array.length - 1);
  }

  public static int binarySearchHelper(int[] array, int target, int left, int right) {
    int middle = (left + right) / 2;
    if (left > right) {
      return -1;
    }
    if (array[middle] == target) {
      return middle;
    } else if (array[middle] > target) {
      return binarySearchHelper(array, target, left, middle - 1);
    } else {
      return binarySearchHelper(array, target, middle + 1, left);
    }
  }
}
