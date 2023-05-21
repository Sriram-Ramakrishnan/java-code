package com.assessments;
import java.util.*;
public class Assessments_Q5 {
    public static void main(String[] args) {
        System.out.println("Enter number of inputs: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int i,j,temp;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Maximum Value = "+arr[n-1]);
        System.out.println("Minimum Value = "+arr[0]);
    }
}
