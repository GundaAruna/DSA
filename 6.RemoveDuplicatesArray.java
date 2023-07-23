
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesArray {
	
	public static int[] removeDuplicates(int[]arr) {
	
		 
		Arrays.sort(arr);
		int j=0;
		int[] temp=new int[arr.length-2];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				
			}
		}
		temp[j++]=arr[arr.length-1];
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {10,10,14,15,16,12,13,13,14};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of elements into array: ");
		int n=sc.nextInt();
		int[]arr= new int[n];
		System.out.print("Enter the elements into the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("After removing the duplicates");
		int[] t1=removeDuplicates(arr);
		for(int i=0;i<t1.length-1;i++) {
			System.out.println(t1[i]+" ");
		}
		

	}

}
