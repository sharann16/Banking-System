import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.time.LocalDate;
public class Transaction {
    public BankAccount bankAccount;
    Transaction(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    Loan loan=new Loan();
    Date dt = new Date();
    boolean t=true;
    Scanner sc=new Scanner(System.in);
    public void main(String userId){

        while (t){
            System.out.println("1)Deposite\n2)Withdraw\n3)Balance\n4)transaction\n5)Apply for loan\n6)Exit");
            int opt=sc.nextByte();
            switch (opt){
                case 1:
                    deposite(userId);
                    break;
                case 2:
                    withdraw(userId);
                    break;
                case 3:
                    balance(userId);
                    break;
                case 4:
                    transaction(userId);
                    break;
                case 5:
                    loan.loan(bankAccount,userId);
                    break;
                case 6:
                    t=false;
            }
        }
    }
    public void deposite(String userId){
        double amt=0;
        try{
            System.out.println("Enter amount to deposite");
            amt=sc.nextDouble();
            if(amt>0){
                bankAccount.userDetail.get(userId).setbalance(bankAccount.userDetail.get(userId).getbalance()+amt);
                bankAccount.userDetail.get(userId).setTransaction(String.valueOf(dt+" "+String.valueOf(amt)+" "+"DR"));
                bankAccount.userDetail.get(userId).setdeposite(amt);
                System.out.println("Balanece : "+bankAccount.userDetail.get(userId).getbalance());
            }

        }catch (Exception e){
            System.out.println("Enter a valid Amount");
            deposite(userId);
        }
    }
    public void withdraw(String userId){
        System.out.println("enter amount multiple of 100");
        double amt=sc.nextDouble();
        if (bankAccount.userDetail.get(userId).getbalance()>amt){
            bankAccount.userDetail.get(userId).setbalance(bankAccount.userDetail.get(userId).getbalance()-amt);
            bankAccount.userDetail.get(userId).setTransaction(String.valueOf(dt+" " +String.valueOf(amt)+" "+"CR"));
            bankAccount.userDetail.get(userId).setWithdraw(amt);
        }else{
            System.out.println("less amount");
        }
        System.out.println("Withdraw anmount"+amt);
        System.out.println("balance : "+bankAccount.userDetail.get(userId).getbalance());
    }
    public void balance(String userId){
        System.out.println(bankAccount.userDetail.get(userId).getbalance());
    }
    public void transaction(String usseId){
        Iterator<String> it= (Iterator<String>) bankAccount.userDetail.get(usseId).gettransaction().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
