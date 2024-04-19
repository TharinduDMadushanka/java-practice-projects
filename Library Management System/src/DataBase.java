import java.util.ArrayList;

public class DataBase {

    ArrayList<User> users = new ArrayList<User>(); //representing users in the system.
    ArrayList<String> usernames = new ArrayList<String>(); //representing the names of the users. This list may be used for tracking user names.

    public void AddUser(User s){
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String phoneNumber, String email){
        int n= -1;
        for (User s : users){
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)){
                n=users.indexOf(s);
                break;
            }
        }
        return n;
    }
    public User getUser(int n){
        return users.get(n);
    }
}
