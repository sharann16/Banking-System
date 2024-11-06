import java.util.LinkedList;

public class Loan {
    public void loan(BankAccount bankAccount,String userid){
        String accType=bankAccount.userDetail.get(userid).getaccountType();
        double balance=bankAccount.userDetail.get(userid).getbalance();
        LinkedList dep=bankAccount.userDetail.get(userid).getdeposite();
        LinkedList wit=bankAccount.userDetail.get(userid).getWithdraw();

    }
}
