package Patterns;

import java.util.Scanner;

public class SolidRectangle {
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
