package Great;

public class Great {
    
public static void great(int num1,int num11){
if(num1>num11){
    
System.out.println("great"+num1);

}else if (num11>num1){
System.out.println("great"+num11);

}else if (num1==num11){

    System.out.println("equal");
}

}

    public static void main(String[] args){
        int num1=10;


        int num11=60;

        Great.great(num1,num11);

    }
}
