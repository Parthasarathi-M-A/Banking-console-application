package project;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ch=99;
        int userch;
        int accountid;
        int usertranferfrom;
        int depositeid;
        int tranferamount;
        user[] us=new user[5];
        admin ad=new admin();
        int uscount=0;
        while(ch>0) {
            try {
                switch (ch) {
                    case 99:
                        mainmenu();
                        System.out.println("Enter the choice : ");
                        ch = s.nextInt();
                        if(ch>2){
                            System.out.println("Invalid choice !!");
                            ch=99;
                        }
                        break;
                    case 1:
                        depositeid = ad.checkadmin();
                        us[depositeid].depositeaction();
                        ch = 99;
                        break;
                    case 2:
                        userMenu();
                        System.out.println("Enter the choice : ");
                        userch = s.nextInt();


                        if (userch == 1) {
                            us[uscount] = new user();
                            us[uscount].setuser(uscount);
                            uscount++;
                            ch = 99;

                        } else if (userch == 2) {
                            System.out.println("Enter the Account ID : ");
                            accountid = s.nextInt();
                            us[accountid].getuser();
                            ch = 99;
                        } else if (userch == 3) {
                            System.out.println("Enter the Account ID : ");
                            accountid = s.nextInt();
                            us[accountid].changepassword();
                            ch = 99;
                        } else if (userch == 4) {
                            System.out.println("Enter your Account ID : ");
                            usertranferfrom = s.nextInt();
                            tranferamount = us[usertranferfrom].transfer();
                            if(tranferamount==-22){
                                ch=99;
                                break;
                            }
                            int tranferToaccount = us[usertranferfrom].transferaction();
                            us[tranferToaccount].tranpering(tranferamount);//

                            //System.out.println("Sorry under construction!!");
                            ch = 99;
                        }
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Ooops !! Something Went Wrong ## let's try again");
                ch=99;
            }
        }

    }


    public static void mainmenu() {
        System.out.println("=====================================================");
        System.out.println("              Welcome to Bank Training               ");
        System.out.println();
        System.out.println(" 1]Admin             2] User");
        System.out.println();
        System.out.println("=====================================================");

    }

    public static void userMenu()
    {

        System.out.println("=====================================================");
        System.out.println("                Bank Training               ");
        System.out.println();
        System.out.println("1] Create Account              2]View My Account  ");
        System.out.println();
        System.out.println("3]Change Pin                   4]Transfer Amount    ");
        System.out.println();
        System.out.println("=====================================================");


    }
}
