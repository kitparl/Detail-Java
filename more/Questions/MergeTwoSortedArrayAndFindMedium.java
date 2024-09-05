import java.util.*;

public class MergeTwoSortedArrayAndFindMedium {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10);
    List<Integer> list2 = Arrays.asList(1, 3, 5, 7, 9);

    List<Integer> newList = new ArrayList<>(list1);
    newList.addAll(list2);

    Collections.sort(newList);

    System.out.println(newList);

    int mid = newList.size() / 2;
    int medium = 0;
    if (mid % 2 == 1) {
      medium = (newList.get(mid - 1) + newList.get(mid)) / 2;
    } else {
      medium = newList.get(mid);
    }
    System.out.println(medium);
  }
}
