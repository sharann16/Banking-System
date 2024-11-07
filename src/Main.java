import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;
public  class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
        NewUser newuser=new NewUser();
         boolean t=true;

        while (t) {
            System.out.println("============================================");
            System.out.println("====== Console Based - Banking System ======");
            System.out.println("============================================");
            System.out.println("\nWelcome to Banking");
            System.out.println("1. New User Registration");
            System.out.println("2. Login with User ID");
            System.out.println("3. Exit");
            System.out.println("Enter your option: ");
            int opt=sc.nextInt();
            switch (opt) {
                case 1:
                    newuser.generateNewUser(bankAccount);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter your user id");
                    String userid = sc.nextLine();
                    System.out.println("Enter your password");
                    String pass2 = sc.nextLine();
                    if (bankAccount.userDetail.containsKey(userid)) {
                        if (bankAccount.userDetail.get(userid).getPass() .equals( pass2)) {
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