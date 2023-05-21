package com.assessments;
import java.util.*;
public class Assessments_Q4 {
    public static void main(String[] args) {
        System.out.printf("1) To calculate the sum of digits.\n2) To reverse the number.\n3) To obtain the sum of the first and last digit of the number.\n4) To find the count of odd and even numbers of the input.\n");
        System.out.println("Enter the option: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int n;
        switch (choice){
            case 1:
            {
                System.out.println("Enter the number: ");
                n = sc.nextInt();
                int rem,sum=0;
                while (n != 0){
                    rem = n%10;
                    n=n/10;
                    sum = sum + rem;
                }

                System.out.println("Sum of digits = "+sum);
                break;
            }

            case 2:
            {
                System.out.println("Enter the number: ");
                n = sc.nextInt();
                int rem;
                System.out.println("Reverse of the number: ");
                while (n != 0){
                    rem = n%10;
                    n=n/10;
                    System.out.print(rem);
                }
                break;
            }

            case 3:
            {
                System.out.println("Enter the number: ");
                n = sc.nextInt();
                int rem1, rem2=0;
                rem1 = n%10;
                while(n != 0){
                    rem2 = n ;
                    n = n/10;
                }
                System.out.println("Sum of the first and last digit = "+(rem1+rem2));
                break;
            }

            case 4:
            {
                System.out.println("Enter the number: ");
                n = sc.nextInt();
                int even_c=0, odd_c=0;
                int rem;
                while(n!=0){
                    rem = n%10;
                    if(rem % 2 ==0){
                        even_c++;
                    }
                    else{
                        odd_c++;
                    }
                    n=n/10;
                }
                System.out.println("Even is "+even_c);
                System.out.println("Odd is "+odd_c);
                break;
            }

            default:
            {
                System.out.println("Invalid Entry!");
                break;
            }
        }
    }
}
