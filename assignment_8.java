//Write a java program to find the largest element of a given 2D array of integers.
import java.io.*;
import java.util.*;
public class  assignment_8{
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows=");
        m=sc.nextInt();
        System.out.println("enter the number of columns=");
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        int i,j;
        System.out.println("enter the elements of the matrix=");
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       int maximum=-100000008;
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            if(maximum<arr[i][j])maximum=arr[i][j];
        }
    }
    System.out.println("the maximum element in this matrix is:"+maximum);
    }
}
