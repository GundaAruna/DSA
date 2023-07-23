import java.util.Scanner;

public class CumulativeMultipleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//5,3,4,2,0,8
		System.out.print("Enter the no.of elements into array: ");
		int n=sc.nextInt();
		int[]arr= new int[n];
		System.out.print("Enter the elements into the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int j=0;
		int p1=1;
		for(int i=0;i<arr.length;i++) {
			
			arr[j]=p1*arr[i];
			p1=arr[j];
			j++;
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}


