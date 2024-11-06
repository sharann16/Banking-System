import java.util.*;
import java.time.LocalDate;
public class Transaction {
    public BankAccount ba;
    Transaction(BankAccount ob){
        ba=ob;
    }
    Date dt = new Date();
    boolean t=true;
    Scanner sc=new Scanner(System.in);
    public void main(String userId){
        while (t){
            System.out.println("1)Deposite\n2)Withdraw\n3)Balance\n4)transaction\n5)exit");
            int opt=sc.nextByte();
            switch (opt){
                case 1:
                    deposite(userId);
                    break;
                case 2:
                    withdraw(userId);
                    break;
                case 4:
                    transaction(userId);
                    break;
                case 5:
                    t=false;
            }
        }


    }

    public void deposite(String userId){
        System.out.println("Enter amount to deposite");
        double amt=sc.nextDouble();
        ba.det.get(userId).setbalance(ba.det.get(userId).getbalance()+amt);
        ba.det.get(userId).setTransaction(String.valueOf(ba.det.get(userId).gettransactionHistory().add(dt+" "+String.valueOf(amt)+"DR")));
        System.out.println("Balanece : "+ba.det.get(userId).getbalance());
    }
    public void withdraw(String userId){
        System.out.println("enter amount multiple of 100");
        double amt=sc.nextDouble();
        if (ba.det.get(userId).getbalance()>amt){
            ba.det.get(userId).setbalance(ba.det.get(userId).getbalance()-amt);
            ba.det.get(userId).setTransaction(String.valueOf(ba.det.get(userId).gettransactionHistory().add(String.valueOf(amt)+"CR")));
        }else{
            System.out.println("less amount");
        }
        System.out.println("Withdraw anmount"+amt);
        System.out.println("balance : "+ba.det.get(userId).getbalance());
    }
    public void transaction(String usseId){
        Iterator<String> it= (Iterator<String>) ba.det.get(usseId).gettransactionHistory().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
