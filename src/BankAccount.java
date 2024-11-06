import java.util.HashMap;


public class BankAccount {

    HashMap<String,User> userDetail=new HashMap<>();
    public void user(String accountNumber, String phno, String userName, String userId,int pass,String dob,String accountType){
        User use=new User(accountNumber,phno, userName, userId,pass,dob,accountType);
        userDetail.put(userId,use);
    }
}