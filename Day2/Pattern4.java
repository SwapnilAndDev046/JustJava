package Day2;
/* 
   *   
  ***
 *****
*******
 */
public class Pattern4 {
  public static void main(String[] args) {
    int n=4;
    int t=n;
    for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=t-1;j++){
                System.out.print("-");
            }
            for(int j =1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            for(int j=1;j<=t-1;j++){
                System.out.print("-");
            }
            t--;
            System.out.println();
        }
  }
}
