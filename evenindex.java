import java.util.*;

public class evenindex{

  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]){
    int size = sc.nextInt();
    int[] arr = new int[size];

    input(arr);

    printEvenIndex(arr);
   }

   public static void input(int[] arr){
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
   }

   public static void printEvenIndex(int[] arr){
    for(int i=0; i<arr.length; i+=2){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
   }
}
