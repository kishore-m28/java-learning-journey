package Patterns;

import java.util.Scanner;

/* Pattern:
    *
   **
  ***
 ****
*****
*/

public class InvertedHalfPyramidRotatedBy_180_deg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        //using separate inner loops for spaces and stars
        // preferred because of readability and easy to understand by beginners
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> space print
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop -> star print
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* MY SOLUTION
Two inner for loops combined and using if-else
for(int i=1; i<=n; i++){
    //inner loop
    for (int j = 1; j <=n; j++) {
        if(j<=n-i)
            System.out.print(" ");
        else
            System.out.print("*");
    }
    System.out.println();
}

        Time Complexity of the methods is O(n^2)
        Because in the split loops method, 1st inner loop run for n-i times and 2nd inner loop runs for i times.
        i.e, (n-i) + i = n for split loops
        So, Totals = n * n = n^2
 */