package project;

import java.util.Scanner;

public class admin extends user{
    public int addamount;
    public int idtodeposite;


    public  int checkadmin(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Username :");
        String adminname=s1.nextLine();
        System.out.println("Hi "+adminname+" enter your password : ");
        String admincorrectpassword="sarathi123";
        String adminpassword=s1.nextLine();
        if(admincorrectpassword.equals(adminpassword))this.idtodeposite=adminwork();
        else {
            System.out.println("Incorrect password try again !!");
            return checkadmin();

        }
        return idtodeposite;
    }


    public  int adminwork(){
        Scanner s1=new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("                Bank Training               ");
        System.out.println();
        System.out.println("Enter the account id to Deposit amount : ");
        idtodeposite =s1.nextInt();
        return idtodeposite;
    }


}