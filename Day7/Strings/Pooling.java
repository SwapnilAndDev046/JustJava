package Day7.Strings;
//both are in the same pool in heap memory
public class Pooling {
  static void pooling(){
    String a = "Hello";
    String b = "Hello";
    System.out.println(a==b);
  }
  public static void main(String[] args) {
    pooling();
  }
}
