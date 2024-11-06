import java.util.HashMap;
import java.util.LinkedList;

public class BankAccount {

    HashMap<String,User> det=new HashMap<>();
    public User user(String accountNumber, String phno, String userName, String userId,int pass){
        User use=new User(accountNumber,phno, userName, userId,pass);
        return det.put(userId,use);
    }
}
