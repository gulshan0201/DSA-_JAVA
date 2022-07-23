import java.util.Scanner;
public class Main
{
    public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int size = sc.nextInt();
		int[] arr = new int[size];
		input(arr);
		maxValue(arr);
	}
	
	public static void input(int[] arr){
	    for(int i=-0; i<arr.length; i++){
	        arr[i] = sc.nextInt();
	    }
	}
	
    public static void maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
