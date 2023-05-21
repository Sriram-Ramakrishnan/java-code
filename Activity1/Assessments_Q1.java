package com.assessments;
import java.sql.SQLOutput;
import java.util.*;
public class Assessments_Q1 {
    public static void main(String[] args) {
        float DA, HRA, PF, Salary, BasicPay;
        System.out.println("Enter Basic Pay: ");
        Scanner sc = new Scanner(System.in);
        BasicPay = sc.nextFloat();
        DA= BasicPay * 0.8f;
        HRA= BasicPay * 0.3f;
        PF= BasicPay * 0.12f;
        Salary=BasicPay+DA+HRA-PF;
        System.out.println("Dearness Allowance (DA): "+DA);
        System.out.println("House Rent Allowance (HRA): "+HRA);
        System.out.println("PF: "+PF);
        System.out.println("Salary: "+Salary);
    }
}
