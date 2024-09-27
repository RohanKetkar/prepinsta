package EvenOrOdd;

class Base{

    int num1;
    public Base(int num1){

     this.num1=num1;

    }
   public void print(){

    if(this.num1%2==0){

   System.out.println("Even");
    }else{

System.out.println("Odd");

    }

   }

}

class Program extends Base{

    public Program(int num1){
        super(num1);
    }
   public void print(){

    super.print();
   }

}
public class EvenOrOdd {
        public static void main(String[] args){

          Base l1=new Program(0);
          l1.print();

    }

}
