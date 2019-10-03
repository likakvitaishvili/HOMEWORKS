import java.util.Scanner;
import java.util.Random;

class Main {

  public static void main(String[] args) {

  //cvladebis gansazgvra  
  Random randomNums = new Random();
  int i,a,b,x;  
  int randomNum;
  int luwi=0;
  int kenti=0;
  int kentebisJami=0;
  int luwebisJami=0;

  //shetana
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a: ");  
   a=input.nextInt();
  System.out.println("Enter b: ");
   b=input.nextInt();

  //ordering
  if (a>b){
    int exchange = a;
    a=b;
    b=exchange;
  }

  //random ricxvebi
  for (i=1; i<=40;i++){
    System.out.println(randomNum=randomNums.nextInt(b)+a);
    
    if (randomNum % 2 == 0){
      luwi++;
      luwebisJami+=randomNum;
    }
    if (randomNum % 2 != 0){
    kenti++;
    kentebisJami+=randomNum;}
  }

  //5 random nums
  System.out.println("5 რენდომ რიცხვი: ");
  for (x=1; x<=5; x++){
    
  if(kentebisJami>luwebisJami){
    System.out.println(randomNums.nextInt(kentebisJami)+luwebisJami);}

  else
  System.out.println(randomNums.nextInt(luwebisJami)+kentebisJami);}

  //output
  System.out.println("ლუწი რიცხვების რაოდენობა: "+luwi);
  System.out.println("კენტი რიცხვების რაოდენობა: "+kenti);
  System.out.println("ლუწების ჯამი : "+luwebisJami);
  System.out.println("კენტების ჯამი : "+kentebisJami);
  }
}
