package Day7.Strings;
// we used for security reasons
//u cannot change the object of a variable to change make new variable
public class immutability {
  static void immutabilityString(){
    String Greet = "Hello";
    Greet = "world";
    System.out.println(Greet);//world not changing the object just creating new object
    //old object go to garbage collection
  }
  public static void main(String[] args) {
    immutabilityString();
  }
 
  
}
