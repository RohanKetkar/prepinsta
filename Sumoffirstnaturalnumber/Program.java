package Sumoffirstnaturalnumber;

abstract class Program1{

   int num1;
    public Program1(int num1){
        
      this.num1=num1;

    }
   abstract public void print();

}

class Program11 extends Program1{
 int num11=0;
public Program11(){

    super(10);
}

@Override 

  public void print(){
   for(int i=1;i<=num1;i++){
      num11=num11+i;
   }
   System.out.println(num11);
   
    }

   
}

public class Program {

   public static void main(String[] args){
Program1 l1=new Program11();

l1.print();
   }

}
