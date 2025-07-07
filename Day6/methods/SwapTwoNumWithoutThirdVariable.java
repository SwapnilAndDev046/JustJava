package Day6.methods;

public class SwapTwoNumWithoutThirdVariable {
  static void swap(int n2,int n1){
    System.out.println("Finally: ");
    System.out.print("N1 is:"+n1+"\nN2 is:"+n2);
  }
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 20; 
    System.out.println("Initially: ");
    System.out.println("N1 is:"+n1+"\nN2 is:"+n2);
    swap(n1, n2);// we are swaping values inside not variable;
  }
}
