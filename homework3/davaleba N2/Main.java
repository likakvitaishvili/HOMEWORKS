import java.util.*;
import java.io.*;

class Main {
  ArrayList<Integer> arraylist = new ArrayList<Integer>();
  Random random = new Random();

  public void arraylist() {

    for (int i = 0; i < 12; i++) {
      arraylist.add(random.nextInt((10 - 5 + 1) + 5));
    }
    System.out.println(arraylist);
  }

  public void AddingNums() {
    for (int i = 0; i < arraylist.size(); i++) {
      if (i % 3 == 0 && i != 0)

        arraylist.add(i + 1, random.nextInt((25 - 20 + 1) + 20));

    }
    System.out.println(arraylist);
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.arraylist();
    main.AddingNums();

  }
}
