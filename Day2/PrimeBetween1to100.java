package Day2;
public class PrimeBetween1to100{
  public static void main(String[] args) {
    int total=0;
    for (int i=2;i<=100;i++){
      int count=0;
      /* count should be declare in the first loop so each number will get new count=0 
      we are not dealing with one number that's why i have put count=0 in the loop */
      for(int j = 1;j<=i;j++){
        if(i%j==0){
          count++;
        } 
      }
      if (count==2) {
        total++;
        System.out.print(i+" ");
      }    
    }
    System.out.println("\nThe Prime number from 1 to 100 is: "+total);
  }
}