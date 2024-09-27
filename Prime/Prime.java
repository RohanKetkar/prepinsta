package Prime;

public class Prime {
   
public static void prime(int num1){
    int prime1=0;

    for(int i=2;i<num1;i++){

        if(num1%i==0 && num1!=i){
           prime1=prime1+1;
        }
    }

    if(prime1>0){
System.out.println("prime");

}else {

    System.out.println("notprime");
}

}



public static void main(String[] args){
         int num1=10;
         
         Prime.prime(num1);


    }
}
