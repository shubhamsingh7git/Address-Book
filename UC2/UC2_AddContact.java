import java.util.*;

public class UC2_AddContact {

    static class AddressBook {
        ArrayList<Contact> contacts=new ArrayList<>();

        void add(Contact c){
            contacts.add(c);
        }
    }

    static class Contact {
        String name,phone,email;

        Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }

        void display(){
            System.out.println(name+" "+phone+" "+email);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AddressBook book=new AddressBook();

        System.out.print("Name: ");
        String name=sc.nextLine();

        System.out.print("Phone: ");
        String phone=sc.nextLine();

        System.out.print("Email: ");
        String email=sc.nextLine();

        book.add(new Contact(name,phone,email));

        for(Contact c:book.contacts)
            c.display();
    }
}
