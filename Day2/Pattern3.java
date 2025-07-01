package Day2;
/* 
* * * * 
* * *
* *
*
 */
public class Pattern3 {
 public static void main(String[] args){ 
  int n=4;
  int t=n;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=t;j++){
      System.out.print("* ");
    }
    t--;
    System.out.println();
  }
}

}
