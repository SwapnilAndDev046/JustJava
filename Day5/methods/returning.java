package Day5.methods;

public class returning {
  static int sum(){
    int a=10;
    int b=-1;
    int sum = a+b;
    return sum;
  }
public static void main(String[] args) {
  System.out.println("sum is "+sum());//if that is return then it is 
  //we have to print method calling
}
}
