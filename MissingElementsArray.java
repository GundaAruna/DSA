import java.util.Scanner;

public class MissingElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,4,5,6};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of elements into array: ");
		int n=sc.nextInt();
		int[]arr= new int[n];
		System.out.print("Enter the elements into the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int l=arr[arr.length-1];
		int[] b=new int[l];
		//elements which are possible in a given range
	for(int i=0;i<l;i++) {
			int t=i+1;
			b[i]=t;
		}
	  //update it to "1" where the elements in arr which are present in b
		for(int i:arr) {
			b[i-1]=1;
		}
		
		
		//Elements which are not present in arr
		
		System.out.println("The missing elements is/are");
		for(int i=0;i<b.length;i++) {
		if(b[i]!=1) {
			
			System.out.print(b[i]+" ");
		}
		}
	}
}

