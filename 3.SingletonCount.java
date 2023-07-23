import java.util.Arrays;
import java.util.Scanner;

public class SingletonCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]a= {10,20,10,20,30,10};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of elements into array: ");
		int n=sc.nextInt();
		int[]a= new int[n];
		System.out.print("Enter the elements into the array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int count=1;
		int c1=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				count=count+1;
			}
			else {
				if(count%2!=0) {
					c1=c1+1;
					
				}
				count=1;
			}
			
			
		}
		if(a[a.length-1]!=a[a.length-2]) {
			c1=c1+1;
		}
		System.out.println(c1);
		}

}
