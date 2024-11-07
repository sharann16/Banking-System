import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.time.LocalDate;
public class Transaction {
    public BankAccount bankAccount;

    //creating construstor  getting the bank account object from the existing user
    Transaction(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    Loan loan=new Loan();
    Date dt = new Date();
    boolean t=true;
    Scanner sc=new Scanner(System.in);

    //getting the userId from the existinguser
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
                    //passing the bank account object and user id to the loan class
                    loan.loan(bankAccount,userId);
                    break;
                case 6:
                    t=false;
            }
        }
    }
    public void deposite(String userId){
        double amt=0;
        System.out.println("Enter amount to deposite");
        while(true){
            try{

                //getting the related userid values from hashmap and store it in the userDetail .
                User userDetail=bankAccount.userDetail.get(userId);
                amt=sc.nextDouble();
                if(amt>0){
                    userDetail.setbalance(userDetail.getbalance()+amt);
                    userDetail.setTransaction(String.valueOf(dt+" "+String.valueOf(amt)+" "+"DR"));
                    userDetail.setdeposite(amt);
                    System.out.println("Balanece : "+userDetail.getbalance());
                    break;
                }else{
                    amt=0;
                    System.out.println("*Enter a valid amount to deposite*");
                }

            }catch (InputMismatchException e){
                System.out.println("Enter a valid Amount");
                sc.next();
            }
        }
    }
    public void withdraw(String userId){


        //getting the related userid values from hashmap and store it in the userDetail .
        User userDetail=bankAccount.userDetail.get(userId);
        double amt;
        while (true){
            System.out.println("enter amount multiple of 100");
            amt= sc.nextDouble();
                if(amt>0){
                    if (userDetail.getbalance()>amt){
                        userDetail.setbalance(userDetail.getbalance()-amt);
                        userDetail.setTransaction(String.valueOf(dt+" " +String.valueOf(amt)+" "+"CR"));
                        userDetail.setWithdraw(amt);

                    }else{
                        System.out.println("less balance");
                        amt=0;
                    }
                    break;
                }else {
                    System.out.println("Enter a valid amount to withdraw");
                }
        }

        System.out.println("Withdraw anmount"+amt);
        System.out.println("balance : "+userDetail.getbalance());
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
