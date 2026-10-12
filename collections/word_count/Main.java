package collections.word_count;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    String text = "apple banana apple orange banana apple";
    String[] words = text.split(" ");

    HashMap<String, Integer> counts = new HashMap<>();

    for (String word : words) {
      int n = counts.getOrDefault(word, 0);
      counts.put(word, n + 1);
    }
    System.out.println(counts);
  }
}
