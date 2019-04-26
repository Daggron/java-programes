import java.util.*;

class Contact{
    String Name;
    String Email;
    String number;
}

class ContactManager{

    Contact myFriends[] = new Contact[500];
    int noOfFriends=0;

    void addFriends(Contact contact){
        myFriends[noOfFriends]=contact;
        noOfFriends++;
    }

    Contact Search (String name){
        for(int i=0;i<noOfFriends;i++){
            if(myFriends[i].Name.equals(name)){
                return myFriends[i];
            }
        }
        return  null;
    }
}

public class Main {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact c[] = new Contact[5];
          for(int i=0;i<5;i++){
              c[i] = new Contact();
          }

            for(int i=0;i<5;i++) {
                System.out.println("Enter The Name of the contact ");
                c[i].Name = sc.nextLine();
                System.out.println("Enter the email of the contact");
                c[i].Email = sc.nextLine();
                System.out.println("Enter the phone number of the contact");
                c[i].number = sc.nextLine();
            }

        ContactManager cm=new ContactManager();
            for(int i=0;i<5;i++){
                cm.addFriends(c[i]);
            }

            System.out.println("Enter the name of contact You want to search");
            String search = sc.next();
             Contact ret = cm.Search(search);

            if(ret!=null){
                System.out.println("Name: "+ret.Name);
                System.out.println("Email: "+ret.Email);
                System.out.println("Mobile Number: "+ret.number);
            }
            else{
                System.out.println("Contact Not Found");
            }
    }
}
