package Day6ReviseThisEveryDay.methods;

public class PrintAllArmstrongNumber {
  static void Armstrong(){
    int i=100;
  
    while (i <=999) {
      int firstDigit = i/100;
      int middleDigit = (i%100)/10;
      int lastDigit = i%10;
      int cube1 = firstDigit*firstDigit*firstDigit;
      int cube2 = middleDigit*middleDigit*middleDigit;
      int cube3 = lastDigit*lastDigit*lastDigit;
      if (cube1+cube2+cube3==i) {
       System.out.println(i); 
      }
      
        i++;
      
    }
  }
  public static void main(String[] args) {
    Armstrong();
  }
}
