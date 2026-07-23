import java.util.*;

public class UC1_CreateContact {
    static class Contact {
        String firstName,lastName,address,city,state,zip,phone,email;

        void display(){
            System.out.println(firstName+" "+lastName);
            System.out.println(address+", "+city+", "+state+" - "+zip);
            System.out.println(phone);
            System.out.println(email);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Contact c=new Contact();

        System.out.print("First Name: ");
        c.firstName=sc.nextLine();

        System.out.print("Last Name: ");
        c.lastName=sc.nextLine();

        System.out.print("Address: ");
        c.address=sc.nextLine();

        System.out.print("City: ");
        c.city=sc.nextLine();

        System.out.print("State: ");
        c.state=sc.nextLine();

        System.out.print("Zip: ");
        c.zip=sc.nextLine();

        System.out.print("Phone: ");
        c.phone=sc.nextLine();

        System.out.print("Email: ");
        c.email=sc.nextLine();

        System.out.println("Contact Created");
        c.display();
    }
}
