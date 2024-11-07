import java.util.LinkedList;

public class User {
    private long accountNumber;
    private double balance;
    private LinkedList<String> transaction=new LinkedList<>();
    private LinkedList<Double> deposite=new LinkedList<>();
    private LinkedList<Double> withdraw=new LinkedList<>();
    private String phno;
    private String userName;
    private String userId;
    private String pass;
    private String dob;
    private String accountType;
    User(long accountNumber, String phno, String userName, String userId,String pass,String dob,String accountType,double initialAmount){
        this.accountNumber=accountNumber;
        this.dob=dob;
        this.accountType=accountType;
        this.userName=userName;
        this.phno=phno;
        this.userId=userId;
        this.pass=pass;
        this.balance=initialAmount;
    }
    public void setdeposite(double amt){this.deposite.add(amt);}
    public void setWithdraw(double amt){this.withdraw.add(amt);}
    public void setbalance(double amt){this.balance=amt;}
    public void setTransaction(String teansaction){this.transaction.add(teansaction);}
    //getter

    public long getaccountNumber(){return accountNumber;}
    public double getbalance(){return balance;}
    public LinkedList<String> gettransaction(){return transaction;}
    public String getuserName(){return userName;}
    public String getuserId(){return userId;}
    public String getPhno(){return phno;}
    public String getPass(){return pass;}
    public LinkedList<Double> getdeposite(){return deposite;}
    public LinkedList<Double> getWithdraw(){return withdraw;}
    public String getdob(){return dob;}
    public String getaccountType(){return accountType;}
}
