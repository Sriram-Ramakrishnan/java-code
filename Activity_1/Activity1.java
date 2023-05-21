import java.util.Scanner;
class OnlineStore{
    public String itemname;
    public int itemid;
    public float itemprice; 
    public int rating;
    Scanner sc = new Scanner(System.in);
    public void getData(){
        System.out.print("Ticket ID: ");
        id = sc.nextInt();
        System.out.print("Customer Name : ");
        name = sc.next();
        System.out.print("Train Name    : ");
        trainname = sc.next();
        System.out.print("Seat Number   : ");
        seat = sc.nextInt();
        System.out.print("Departure Date: ");
        date = sc.next();
        System.out.print("Departure Time: ");
        time = sc.next();
        System.out.print("Enter Confirmation status (y/n): ");
        sc.next();
        status = sc.next();
        System.out.println();
    }

    public static void popularList(OnlineStore obj[],int n) {
        for(i=0;i<n;i++){
            if(obj[i].rating>=4){
                System.out.println(obj[i].itemid,obj[i].itemname,obj[i].itemprice);
            }
        }
        }
        
    

    public void search_info(railway obj[], int tn){
        for(i=0;i<n;i++){
            if(search_id == obj[i].TicketId){
                System.out.println("Status of the ticket:"+obj[i].status);
            }
        }
            }

    public static void searchItem(int item_no) {
        for(i=0;i<n;i++){
            if(search_id == obj[i].TicketId){
                System.out.println("Status of the ticket:"+obj[i].status);
            }
        }
    }

public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Railway [] objects;
        int n = 100;
        System.out.println("Enter total number of elements: ");
        n = sc.nextInt();
        objects = new Railway[n];
        int i;
        for(i=0;i<n;i++){
            obj[i] = new Railway();
            obj[i].getData();
        }
        System.out.println("Enter ticket number to be searched: ");
        int search_id= sc.nextInt();
        objects[i].search_info(objects, search_id);
    }
}