import java.util.ArrayList;
import java.util.List;


class Mesame implements interfaceMain {
  public int a=95;
  public int b=100;

@Override
public void methodOne(){ //nums between a and b
System.out.print("\nNums between "+ a+" and "+b+" : ");

 for(int i=a;i<=b;i++){
  System.out.print(i+" ");
  }
}

@Override
public void methodTwo(){ //a s gamkopebi
   System.out.print("\n"+a+"-is  gamkopebi: ");
    for (int i=1;i<=a;i++) 
            if (a%i==0) {
            //System.out.print(i+" ");}}
                System.out.printf("%d ",i); }}

@Override
 public void methodThree(){//b s martivi gamkopebi
 System.out.print("\n"+b+"-is martivi gamkopebi: ");

       for(int i = 2; i< b; i++) {
         while(b%i == 0) {
            System.out.print(i+" ");
            b = b/i;
         }
      }
      if(b > 2) 
         System.out.println(b);}
 

@Override
public  int methodFour(int x) { 

if (x < 0) 
    x = -x; 
  
int result = 0;  
int max_count = 1;  

for (int d = 0; d <= 9; d++) 
{ 
    int count = countOccurrences(x,d); 

    if (count >= max_count) 
    { 
        max_count = count; 
        result = d; 
    } 
} 
return result; 

}       
//damxmare methodi methodFour istvis
 int countOccurrences(int x, int d) 
{ 
    int count = 0;  
    while (x > 0) 
    { 
        if (x % 10 == d) 
        count++; 
        x = x / 10; 
    } 
    return count; 
}

  public static void main(String[] args) {
    Mesame myObj = new Mesame();
    myObj.methodOne();
    myObj.methodTwo();
    myObj.methodThree();
    System.out.println("\nMax occurring digit in b: " + 
myObj.methodFour(100));

  }
}
