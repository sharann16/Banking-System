import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;
public  class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount ba=new BankAccount();
        BankAccount a=ba;//why
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



//                    DateTimeFormatter formate=DateTimeFormatter.ofPattern("yyyy-mm-dd");
//                    LocalDate Dob=null;
//                    while(Dob==null){
//                        System.out.println("D.O.B formate yyyy-mm-dd");
//                        String dob=sc.nextLine();
//                        try{
//                            Dob=LocalDate.parse(dob,formate);
//                        }catch (){
//
//                        }
//                    }


                    String userId = userName.substring(0, 3) + phno.substring(7);
                    Random ram = new Random();
                    long random = ram.nextLong(10000, 99999);
                    String accno = random + phno.substring(5);
                    System.out.println("Account Number : " + accno);
                    System.out.println("User Id : " + userId);
                    System.out.println("Set 4 digit Password : ");
                    int pass = sc.nextInt();
                    ba.user(accno, phno, userName, userId, pass);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter your user id");
                    String userid = sc.nextLine();
                    System.out.println("Enter your password");
                    int pass2 = sc.nextInt();
                    if (ba.det.containsKey(userid)) {
                        if (ba.det.get(userid).getPass() == pass2) {
                            Transaction trans = new Transaction(a);
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