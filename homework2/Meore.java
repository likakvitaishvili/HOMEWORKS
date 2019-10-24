import java.io.*;
import java.util.*;

class Meore {
  public static void main(String[] args) {
    try {
//Opens function.txt file
Scanner file = new Scanner(new File("function.txt"));


int largest = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;


while(file.hasNextInt()) {

  int number = file.nextInt();

  if(number > largest) {
    largest = number;
  }
  if(number < min){
    min = number;
  }

//Prints numbers from function.txt file     
System.out.print(number+"; ");
}

file.close();

System.out.println("\nMinimum number is: " +min);
System.out.println("Maximum number is: " +largest); 

}
catch(IOException e) {
  System.out.println(e.getMessage());
  }}}
