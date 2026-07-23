import java.util.*;

public class UC4_DeleteContact {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<String> contacts=new ArrayList<>();
        contacts.add("John");
        contacts.add("Alex");
        contacts.add("David");

        System.out.print("Enter name to delete: ");
        String name=sc.nextLine();

        if(contacts.remove(name))
            System.out.println("Deleted Successfully");
        else
            System.out.println("Contact Not Found");

        System.out.println(contacts);
    }
}
