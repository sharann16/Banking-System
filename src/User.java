import java.util.LinkedList;

public class User {
    private String accountNumber;
    private double balance;
    private LinkedList<String> transaction=new LinkedList<>();
    private LinkedList<Double> deposite=new LinkedList<>();
    private LinkedList<Double> withdraw=new LinkedList<>();
    private String phno;
    private String userName;
    private String userId;
    private int pass;
    private String dob;
    private String accountType;
    User(String accountNumber, String phno, String userName, String userId,int pass,String dob,String accountType){
        this.accountNumber=accountNumber;
        this.dob=dob;
        this.accountType=accountType;
        this.userName=userName;
        this.phno=phno;
        this.userId=userId;
        this.pass=pass;
    }
    public void setdeposite(double amt){this.deposite.add(amt);}
    public void setWithdraw(double amt){this.withdraw.add(amt);}
    public void setbalance(double amt){this.balance=amt;}
    public void setTransaction(String teansaction){this.transaction.add(teansaction);}
    //getter

    public String getaccountNumber(){return accountNumber;}
    public double getbalance(){return balance;}
    public LinkedList<String> gettransaction(){return transaction;}
    public String getuserName(){return userName;}
    public String getuserId(){return userId;}
    public String getPhno(){return phno;}
    public int getPass(){return pass;}
    public LinkedList<Double> getdeposite(){return deposite;}
    public LinkedList<Double> getWithdraw(){return withdraw;}
    public String getdob(){return dob;}
    public String getaccountType(){return accountType;}
}
