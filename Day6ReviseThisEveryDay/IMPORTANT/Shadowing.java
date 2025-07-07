package Day6ReviseThisEveryDay.IMPORTANT;

public class Shadowing {
  static int a = 4;// what ever we are writing in the class should contain static
  
  public static void main(String[] args) {
    System.out.println(a);//4
   int a = 90;
   System.out.println(a); //90
   fun();
  }
  static void fun(){
System.out.println(a);//4
  }

}


