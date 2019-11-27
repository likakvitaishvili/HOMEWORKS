import java.util.*;
import java.io.*;

class Main {
  ArrayList<Integer> arraylist = new ArrayList<Integer>();

  public void arraylist() {
    Random random = new Random();

    for (int i = 1; i <= 12; i++) {
      arraylist.add(random.nextInt());
    }
    Collections.sort(arraylist);
    System.out.println(arraylist);
  }

  public void RemoveEven() {

    for (int i = 1; i <= arraylist.size(); i++) {
      if (i % 2 == 0)
        arraylist.remove(i);
    }
    System.out.println(arraylist);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.arraylist();
    main.RemoveEven();

  }
}
