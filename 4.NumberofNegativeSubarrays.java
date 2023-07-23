import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int c1=0;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum=sum+arr[j];
                if(sum<0) {
                    c1=c1+1;
                }
            }
        }
        System.out.println(c1);
    }
}
