package com.assessments;
import java.util.Scanner;
class railway{
    public int Ticket_Id;
    public String Customer_name;
    public String train_name;
    public int seat_no;
    public String date;
    public String departure_time;
    public String confirmation_status;
    Scanner sc = new Scanner(System.in);
    public void getData(){
        System.out.println("Enter Ticked Id: ");
        Ticket_Id = sc.nextInt();
        System.out.println("Enter Customer Name: ");
        Customer_name = sc.next();
        System.out.println("Enter Train Name: ");
        train_name = sc.next();
        System.out.println("Enter Seat Number: ");
        seat_no = sc.nextInt();
        System.out.println("Enter Date: ");
        date = sc.next();
        System.out.println("Enter Departure Time: ");
        departure_time = sc.next();
        System.out.println("Enter Confirmation status (y/n): ");
        confirmation_status = sc.next();
    }

    public void search_info(railway obj1 , int tn){
        int i;
        for(i=0;i<3;i++){
            if(obj1.confirmation_status.equalsIgnoreCase("y")){
                System.out.println("Status of the ticket: y");
                break;
            }
            else{
                System.out.println("Status of the ticket: n");
                break;
            }
        }
    }
}
public class Assessments_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        railway [] obj;
        obj = new railway[3];
        int i;
        for(i=0;i<3;i++){
            obj[i] = new railway();
            obj[i].getData();
        }
        System.out.println("Enter ticket number to be searched: ");
        int search_ticket= sc.nextInt();
        for(i=0;i<3;i++){
            if(search_ticket == obj[i].Ticket_Id){
                obj[i].search_info(obj[i],search_ticket);
            }
        }
    }
}