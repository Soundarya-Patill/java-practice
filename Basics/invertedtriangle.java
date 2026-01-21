package Basics;
import java.util.*;

public class invertedtriangle {
    public static void main(String[]args){
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
