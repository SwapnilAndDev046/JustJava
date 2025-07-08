package Day6ReviseThisEveryDay.IMPORTANT;
// Scoping means each variable can access in his own block only 
public class Scoping {
  static void mess(){
    int a =30;
    System.out.println(a+"    2");
  }
  public static void main(String[] args) {
    int a = 10;
    {//scoping means each variable has meaning 
       a = 20;
       System.out.println(a+"    1");
    }// we can create this type of block
    mess();
    System.out.println(a+"      3");
  }
}
