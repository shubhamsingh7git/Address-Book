import java.util.*;

public class UC3_EditContact {

    static class Contact {
        String name,phone,email;

        Contact(String n,String p,String e){
            name=n;
            phone=p;
            email=e;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<Contact> list=new ArrayList<>();
        list.add(new Contact("John","11111","john@gmail.com"));

        System.out.print("Enter name to edit: ");
        String name=sc.nextLine();

        for(Contact c:list){
            if(c.name.equalsIgnoreCase(name)){
                System.out.print("New Phone: ");
                c.phone=sc.nextLine();

                System.out.print("New Email: ");
                c.email=sc.nextLine();

                System.out.println("Contact Updated");
                return;
            }
        }

        System.out.println("Contact Not Found");
    }
}
