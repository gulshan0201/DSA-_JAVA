import java.util.Scanner;

public class functions{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){
    int numberOfLines = sc.nextInt();
    patter(numberOfLines);

  }

  public static void patter(int numberOfLines){
    for(int i=1; i<=numberOfLines; i++){
      int stars = i;
      int spaces = numberOfLines - i;
      printSpace(spaces);
      printStars(stars);
      System.out.println();
    }
  }

  public static void printSpace(int space){
    for(int i=1; i<=space; i++){
      System.out.print(" ");
    }
  }

  public static void printStars(int star){
    for(int i=1; i<=star; i++){
      System.out.print("*");
    }
  }
}

/**
    *
   **
  ***
 ****
*****  

/


