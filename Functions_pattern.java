import java.util.Scanner;

public class functions {

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){
    int noOfLines = sc.nextInt();
    patter(noOfLines);
  }

  public static void patter(int noOfLines){
    for(int i=1; i<=noOfLines; i++){
      singleLine(i);
      System.out.println();
    }
  }

  public static void singleLine(int noofstars){
    for(int i=1; i<=noofstars; i++){
      System.out.print("* ");
    }
  }
}

/**
*
**
***
****
*****
******

/
