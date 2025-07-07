package Day5.methods;

public class TwoNumberSwapping {
  static void Swap(int a,int b){
    int temp =a;
    a = b;
    b = temp;
    System.out.println("New A is:"+a+"\nNew B is:"+b);
  }
  public static void main(String[] args) {
    Swap(10,20);
  }
}
