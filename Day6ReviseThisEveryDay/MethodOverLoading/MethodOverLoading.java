package Day6ReviseThisEveryDay.MethodOverLoading;
// two or more same name Method/functions with Diffrent Parameters
public class MethodOverLoading {
  public static void main(String[] args) {
    fun(5,6);
    fun(4);
  }
  static void fun(int a){
System.out.println(a);
  }
  static void fun(int b,int a){
    System.out.println(b+" "+a);
  }
}
