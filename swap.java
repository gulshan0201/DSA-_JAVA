import java.util.*;

public class swap {

  public static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){

    int a = sc.nextInt();
    int b = sc.nextInt();

    // SWAP VALUES OF A AND B USING THIRD VARIABLE
    /* 
    System.out.println(a + " " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a + " " + b);
    */
    
    // SWAP VALUES OF A AND B WITHOUT USING THIRD VARIABLE
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println(a + " " + b);

    b = ((a + b) - (a = b));
    System.out.println(a + " " + b);
  }

}
