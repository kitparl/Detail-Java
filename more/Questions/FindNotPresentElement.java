import java.util.*;

public class FindNotPresentElement {
  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(1, 3, 4);

    for (int i : list1) {
      if (!list2.contains(i)) {
        System.out.println(i);
      }
    }
  }
}
