package com.assessments;
import java.util.Scanner;
public class Assessments_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int [n];

        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] new_arr = new int [n];
        for(i=0;i<n;i++){
            if((arr[i]%5) != 0){
                new_arr[i] =arr[i];
            }
        }

        System.out.println("Array without the number divisible by 5:");
        for(i=0;i< new_arr.length;i++){
            if(new_arr[i] ==0){
                continue;
            }
            else{
                System.out.println(new_arr[i]);
            }
        }

    }
}