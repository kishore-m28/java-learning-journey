package Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        //outer loop
//        for(int i=1; i<=n; i++){
//            //inner loop
//            for(int j=1; j<=n; j++){
//                if(j<=i)
//                    System.out.print("*");
//            }
//            System.out.println();
//        }

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
