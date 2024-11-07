import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class BankAccount   {

    HashMap<String,User> userDetail=new HashMap<>();
    public void userInitialDetail(long accountNumber, String phno, String userName, String userId,String pass,String dob,String accountType,double initialAmount){
        User use=new User(accountNumber,phno, userName, userId,pass,dob,accountType,initialAmount);
        userDetail.put(userId,use);
    }
 public void file(ObjectOutputStream obs,BankAccount bankAccount){
     try {
         obs.writeObject(bankAccount.userDetail);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
 }
}