package cw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;



public class Main {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    Random rn = new Random();

    for (int i = 0; i < 15; i++) {
      list.add(rn.nextInt(5));
    }
    System.out.println(list);

    Map<Integer, Integer> stat = new HashMap<>();

    for (Integer element : list) {
      Integer n = stat.get(element);
      if (n == null) {
        stat.put(element, 1);
      } else {
        stat.put(element, n + 1);
      }
    }
    System.out.println(stat);
  }

}