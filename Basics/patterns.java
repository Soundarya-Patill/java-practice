package Basics;
import java.util.*;
public class patterns{
    public static void main(String[] args) {
        System.out.println("Enter the number Of rows and Colums:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");

            }
            System.out.println();

        }
        
    }


}