package Day4;

public class booleans2 {
  public static void main(String[] args) {
    boolean passedTheDoor = true;
    boolean missedTheDoor = false;
    boolean passedAllTheDoors =false;
    int DoorCount = 0;
    if(passedTheDoor){
      System.out.println("Passed the 1st Door");
      DoorCount++;
    }
    if (passedTheDoor) {
      System.out.println("Passed the 2nd Door");
      DoorCount++;
    }
    if (!missedTheDoor) {
      System.out.println("Passed the 3rd Door");
      DoorCount++;     
    }
    if (DoorCount==3) {
      passedAllTheDoors = true;
    }
    if (passedAllTheDoors) {
      System.out.println("Congratulations for getting this program right!!");
    }
  }
}
