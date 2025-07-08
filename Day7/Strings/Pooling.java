package Day7.Strings;

public class Pooling {
  static void pooling(){
    String a = "Hello";
    String b = "Hello";
    System.out.println(a==b);//true (since they are in the pool 
    //means small memory structure in heap memory)
    
  }
  public static void main(String[] args) {
    pooling();
  }
}
