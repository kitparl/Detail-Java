import java.util.*;

public class ReverseSubstringOfString {
  public static void main(String[] args) {
    String name = "pranshus"; // rp na hs su
    int by = 2;

    // approach 1

    String bag = "";
    List<String> list = new ArrayList<>();
    for (int i = 0; i < name.length(); i += by) {
      bag += name.charAt(i) + name.charAt(i + 1);
      list.add(bag);
    }
    System.out.println(list);

  }
}
