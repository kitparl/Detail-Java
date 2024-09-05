public class BinarySearch {
  public static int isPresentElement(int[] arr, int size, int target) {
    int left = 0;
    int right = size - 1;

    while (left < right) {
      // int mid = size / 2;

      int mid = left + (right - left) / 2;
      if (arr[mid] == target) {
        return target;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int size = arr.length;
    int k = 1;
    int res = isPresentElement(arr, size, k);
    System.out.println(res);
  }

}
