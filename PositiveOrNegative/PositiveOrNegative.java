package PositiveOrNegative;
import java.util.Scanner;

class Program{

 public static boolean posiornot=false;
   static boolean posiornot(int num1){

      
      if(num1>=0){posiornot=true; return true;}
        posiornot=false; return false;
   }

public static void print(){

   if(posiornot==true){

      System.out.println("positive");
   }else{

System.out.println("negative");

   }
}

}

class PositiveOrNegative{
static Scanner sc=new Scanner(System.in);

   public static void main(String[] args){
System.out.println("Enter");

     int num1=sc.nextInt();
     Program.posiornot(num1);
     Program.print();
   }
}