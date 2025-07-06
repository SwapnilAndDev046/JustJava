package Day5.methods;

import java.util.*;

public class method1 {
//we have created the method over here 
  static void sum(){
   try(Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter Number 1: ");
    int a = sc.nextInt();
    System.out.print("Enter Number 2: ");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("Addition of the two number is: "+sum);
  }
}

  public static void main(String[] args) {
    //take input of 2 numbers and print the sum
    sum();// we call the method here.
    }
  }

