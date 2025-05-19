package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int m = sc.nextInt();
        System.out.println("Enter no. of columns:");
        int n = sc.nextInt();
        //outer loop
        for(int i=1; i<=m; i++){
            //inner loop
            for(int j=1; j<=n; j++){
                //cell -> (i,j)
                if(i==1 || j==1 || i==m || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//Explanation:

//        (1,1) (1,2) (1,3) (1,4) (1,5) -> i=1
//        (2,1) (2,2) (2,3) (2,4) (2,5)
//        (3,1) (3,2) (3,3) (3,4) (3,5)
//        (4,1) (4,2) (4,3) (4,4) (4,5) i=m
//        j=1                      j=n
