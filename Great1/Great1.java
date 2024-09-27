package Great1;

public class Great1 {
  
public static void great(int num1,int num2,int num3){
     if(num1>num2 && num1>num3){
            
       System.out.println("great"+num1);     

     }else if(num2>num1 & num2>num3){ 
        System.out.println("great"+num2);

     }else{

      System.out.println("great"+num3);

     }
}


public static void main(String[] args){

    int num1=10;

    int num2=20;
    int num3=30;

      Great1.great(num1,num2,num3);

  }
}
