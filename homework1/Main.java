import java.util.Scanner;
class Main {
  public int a,b,c;

//metodi1
public void metodi1(){
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter a: ");
     a = myObj.nextInt();

     System.out.println("Enter b: ");
      b = myObj.nextInt();

     System.out.println("Enter c: ");
      c = myObj.nextInt();

}
    
// //metodi2
      public  int lastDigit() 
    { 
   return (a % 10); 
    }

    //metodi3
  public  int firstDigit() 
    { 
        while (b >= 10)  
            b /= 10; 

        return b; 
    }

    //metodi4
    public int sumOfDigits(){
      int n, sum = 0;
while(c > 0)
        {
            n = c % 10;
            sum = sum + n;
            c = c / 10;
        }
        return sum;
    }

//metodi5
public int namravli(){
return lastDigit()*firstDigit();
}

//metodi6
public int jami(){
  return firstDigit()+namravli();
}



  public static void main(String[] args) {
    Main con = new Main();
    con.metodi1();
    System.out.println("Last digit of a is "+con.lastDigit());
    System.out.println("First digit of b is "+con.firstDigit());
    System.out.println("Sum of c digits is "+con.sumOfDigits());
    System.out.println("a[-1] * b[0] = "+ (con.namravli()));
    System.out.println("b[0] + (a[-1] * b[0]) = "+ (con.jami()));


  }
}
