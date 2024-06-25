// write a program to print the elements above the secondary diagonal in a user inputted square matrix.
import java.io.*;
import java.util.*;

public class assignment_6{
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
        System.out.println("Elements above the secondary diagonal are as follow:");
        for( i=0;i<m;i++){
            for(j=0; j<n;j++){
                if(i+j<m-1)System.out.println(arr[i][j]+" ");
            }
        }
}

}
