package Day5.methods;

public class Greetings {

  static void GreetingToThePerson(String Name){
   String str = "Hello, "+Name+"!";
   System.out.println(str);
  }

  public static void main(String[] args) {
    GreetingToThePerson("Swapnil");
    GreetingToThePerson("Ram");
  }
}
