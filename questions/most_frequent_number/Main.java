package questions.most_frequent_number;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {3, 1, 4, 1, 3, 4};
    HashMap<Integer, Integer> counts = new HashMap<>();

    for (int number : numbers) {
      int count = counts.getOrDefault(number, 0);
      counts.put(number, count + 1);
    }

    int maxCount = 0;
    ArrayList<Integer> maxKeys = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        maxKeys.clear();
        maxKeys.add(entry.getKey());
      }
      else if (entry.getValue() == maxCount) {
        maxKeys.add(entry.getKey());
      }
    }

    Collections.sort(maxKeys);
    System.out.println("最も多い数字：" + maxKeys);
    System.out.println("出現回数：" + maxCount);

  }
}
