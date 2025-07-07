package Day6ReviseThisEveryDay.IMPORTANT;
import java.util.Arrays;
public class VaraibleArguments {
  public static void main(String ...v) {
    System.out.println("hello");
    fun(1,2,3,4,5,56,6,5,4);
  }

  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }

}
