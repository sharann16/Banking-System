import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;
public  class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
//        BankAccount a=bankAccount;//why
         boolean t=true;
        while (t) {
        System.out.println("1)Create account\n2)Existing account");
        int opt=sc.nextInt();
            switch (opt) {
                case 1:
                    sc.nextLine();
                    System.out.println("enter user name");
                    String userName = sc.nextLine();
                    System.out.println("enter phone number");
                    String phno = sc.nextLine();
                    String userId = userName.substring(0, 3) + phno.substring(7);
                    Random ram = new Random();
                    long random = ram.nextLong(10000, 99999);
                    String accno = random + phno.substring(5);
                    System.out.println("Account Number : " + accno);
                    System.out.println("User Id : " + userId);
                    System.out.println("Set 4 digit Password : ");
                    int pass = sc.nextInt();
                    bankAccount.user(accno, phno, userName, userId, pass,"3","4");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter your user id");
                    String userid = sc.nextLine();
                    System.out.println("Enter your password");
                    int pass2 = sc.nextInt();
                    if (bankAccount.userDetail.containsKey(userid)) {
                        if (bankAccount.userDetail.get(userid).getPass() == pass2) {
                            Transaction trans = new Transaction(bankAccount);
                            trans.main(userid);
                        } else {
                            System.out.println("invalid password");
                        }
                    } else {
                        System.out.println("Account not found");
                    }

                    break;
            }
        }
    }
}