package cw;



import java.util.Comparator;

public class CatNameLengthComparator implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    // TODO Auto-generated method stub
    Cat cat1 = (Cat) o1;
    Cat cat2 = (Cat) o2;

    String name1 = cat1.getName();
    String name2 = cat2.getName();

    if (name1.length()>name2.length()) {
      return 1;
    }

    if (name1.length()<name2.length()) {
      return -1;
    }
    
    return 0;
  }

}