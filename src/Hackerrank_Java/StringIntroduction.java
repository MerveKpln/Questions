package Hackerrank_Java;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
//java 8
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length()+B.length();
        System.out.println(sum);

        int compare= A.compareTo(B);//String compare
        if (compare>0) System.out.println("Yes");
        else  System.out.println("No");

        A=A.substring(0,1).toUpperCase()+A.substring(1);
        B=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(A +" " + B);


    }
}
