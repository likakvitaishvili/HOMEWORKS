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
    for (Iterator<Integer> iterator = arraylist.iterator(); iterator.hasNext();) {
      Integer number = iterator.next();
      if (number % 2 == 0) {
        System.out.println("Remove -> " + number);
        iterator.remove();
      }
    }
    System.out.println(arraylist);

  }

  public static void main(String[] args) {
    Main main = new Main();
    main.arraylist();
    main.RemoveEven();

  }
}
