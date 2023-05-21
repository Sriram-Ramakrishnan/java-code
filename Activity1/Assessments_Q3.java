package com.assessments;
import java.util.*;
public class Assessments_Q3 {
    public static void main(String[] args) {
        int marks;
        System.out.print("Enter your marks : ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks >= 40 && marks<=60){
            System.out.println("Grade = E");
        }
        else if ( marks> 60 && marks<=80) {
            System.out.println("Grade = B");
        }
        else if (marks>80 && marks<=90) {
            System.out.println("Grade = A");
        }

        else if (marks>90 && marks<=100) {
            System.out.println("Grade = S");
        }

        else{
            System.out.println("Invalid Mark Entry");
        }
        sc
    }
}
