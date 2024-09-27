package Leap;

public class Leap {
   
public static void leap(int num1){
    if(num1%400==0){

System.out.println("leap");

    }else if(num1%4==0 && num1%100!=0){
System.out.println("leap");
        
    }else{

        System.out.println("notleap");
    }
}

    public static void main(String[] args){

        int num1=2001;

        Leap.leap(num1);
    }

}
