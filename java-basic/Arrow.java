
package cheatsheet;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args){
        int rows,cols,stars,i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows : ");
        rows = sc.nextInt();
        System.out.print("Cols : ");
        cols = sc.nextInt();
        stars = 1;
        k = 0;
        while(k<rows){
            i = 0;
            while(i<cols){
                System.out.print(" ");
                i++;
            }
            j=0;
            while(j<stars){
                System.out.print("*");
                j++;
            }
            stars+=2;
            System.out.println();
            cols--;
        k++;
        }
    }
}