package project;

import java.util.Scanner;

public class user {
    public int id=0;
    public String name;
    public String Aadhar;
    public String phno;
    public String email;
    public String password;
    public int pin;
    public int balance=0;
    public int amount;
    public int transferaccount;
    public int transferamount;
    public  void setuser(int id) {
        this.id=id;
        Scanner s1=new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("                Bank Training               ");
        System.out.println();
        System.out.println("Enter the user name : ");
        this.name=s1.nextLine();
        System.out.println("Phone number : ");
        this.phno=s1.nextLine();
        System.out.println("Enter the Aadhar number : ");
        this.Aadhar=s1.nextLine();
        System.out.println("Enter the Email Id : ");
        this.email=s1.nextLine();
        System.out.println("Enter the password : ");
        //s1.nextLine();
        this.password=s1.nextLine();
        System.out.println("Enter the transaction pin (* Should be in Number*) : ");
        this.pin=s1.nextInt();
        this.balance=balance;
        System.out.println("!!!!!Account Created successfully !!!!!");
        System.out.println("Your Account ID is : "+id+" note it for further Login ");
        System.out.println("            ###   Thank you ###");

    }
    public void getuser(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the password");
        String pass=s1.nextLine();
        if(pass.equals(password)){
            System.out.println("Name : "+name);
            System.out.println("Phone Number : "+phno);
            System.out.println("Aadhar Number : "+Aadhar);
            System.out.println("Email ID : "+email);
            System.out.println("Password : "+password);
            System.out.println("Transaction Pin : "+pin);
            System.out.println("Balance : "+balance);
        }
        else {
            System.out.println("Wrong Password");
            getuser();
        }

    }
    public void changepassword(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the password");
        String pass=s1.nextLine();
        if(pass.equals(password)) {
            System.out.println("Enter the new password : ");
            password=s1.nextLine();
            System.out.println("Enter the new Pin : ");
            pin=s1.nextInt();
            System.out.println("Password and PIN changed successfully ");
        }
    }

    public void depositeaction(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the amount to deposit");
        this.amount=s1.nextInt();
        this.balance+=amount;
        System.out.println("Ammount "+amount+" has successfully deposited !!!");
    }
    public void tranpering(int amt){
        this.balance+=amt;
        System.out.println("Ammount "+amt+" successfully transfered !!");
    }
    public  void pinchek(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the transaction PIN :");
        int tpin=s1.nextInt();
        if(tpin!=this.pin){
            System.out.println("Wrong transaction PIN !! Try again #");
            pinchek();
        }
    }
    public int transfer()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the password");
        String pass=s1.nextLine();
        if(pass.equals(password)) {
            System.out.println("Enter the amount to transfer");
            transferamount=s1.nextInt();
           pinchek();
            if(transferamount>this.balance)
            {
                System.out.println("Balance is low to transfer this amount");
                return -22;
            }
            this.balance-=transferamount;
            return transferamount;
        }
        else {
            System.out.println("Wrong Password");
            transfer();
        }
        return transferamount;
    }
    public int gettoid(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the account to transfer : ");
        transferaccount=s1.nextInt();
        return transferaccount;
    }
    public int transferaction()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the account to transfer : ");
        transferaccount=s1.nextInt();
        return transferaccount;
    }

}