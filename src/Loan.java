import java.util.LinkedList;

public class Loan {
    public void loan(BankAccount bankAccount,String userid){
        String accType=bankAccount.userDetail.get(userid).getaccountType();
        double balance=bankAccount.userDetail.get(userid).getbalance();
        LinkedList<Double> dep=bankAccount.userDetail.get(userid).getdeposite();
        LinkedList<Double> wit=bankAccount.userDetail.get(userid).getWithdraw();
        System.out.println(dep.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println(wit.stream().mapToDouble(Double::doubleValue).sum());

    }
}
