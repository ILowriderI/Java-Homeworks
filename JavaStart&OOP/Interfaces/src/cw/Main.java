package cw;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Cat cat1 = new Cat("Vaska", 6);
    Cat cat2 = new Cat("Luska", 2);
    Cat cat3 = new Cat("Umka", 4);
    Cat cat4 = new Cat("Barsic", 8);
    Cat cat5 = new Cat("Timka", 5);

    Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };
    for (int i = 0; i < cats.length; i++) {
      System.out.println(cats[i]);
    }

    System.out.println();

    Arrays.sort(cats, new CatNameLengthComparator());

    for (int i = 0; i < cats.length; i++) {
      System.out.println(cats[i]);
    }

  }

}