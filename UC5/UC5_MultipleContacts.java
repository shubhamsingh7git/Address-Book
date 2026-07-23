import java.util.*;

public class UC5_MultipleContacts {

    static class Contact {
        String name;
        String phone;

        Contact(String n,String p){
            name=n;
            phone=p;
        }

        void display(){
            System.out.println(name+" : "+phone);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<Contact> contacts=new ArrayList<>();

        System.out.print("Number of contacts: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.print("Name: ");
            String name=sc.nextLine();

            System.out.print("Phone: ");
            String phone=sc.nextLine();

            contacts.add(new Contact(name,phone));
        }

        System.out.println("Address Book");

        for(Contact c:contacts)
            c.display();
    }
}
