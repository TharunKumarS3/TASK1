import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class Banking_System
{
    int amount_deposit;
    Scanner in=new Scanner(System.in);
    String[][] account_Details = new String[10][5];
    ArrayList<Integer> amount = new ArrayList<Integer>();
    

    void account_reation(int count)
    {

      System.out.println("----------------------------------------------------------------------------");  
      int c=count;
      for(int i=c-1;i<c;i++)
        {
            System.out.println(" ENTER FOLLOWING DETAILS TO CREATE ACCOUNT :");
             System.out.println(" 1.NAME        2.PHONE NUMBER      3.AADHAR NUMBER     4.ADDRESS"); 
             for(int j=0;j<4;j++)
             {
                account_Details[i][j]=in.next();
             }
        System.out.println("------------------------ ACCOUNT CREATED SUCCESSFULLY----------------------");
        System.out.println(" ");
        System.out.println(account_Details[i][0] + " YOUR SECERET CODE IS -> " + i ); 
        System.out.println(" ");
        System.out.println(" ************************ Dont share your secret code **********************");
        amount.add(0);
        
        }
    }


void deposit (int code)
{
    System.out.println("__________________________________________________________________________________");
    System.out.println("| NAME         |     PHONE NUMBER    |      AADHAR NUMBER    |      ADDRESS      | ");
    System.out.println("__________________________________________________________________________________");
    for(int i=0;i<1;i++)
    {
     for(int j=0;j<4;j++)
    {
        System.out.print("  " + account_Details[code][j] + "\t |");   
    }
    System.out.println(" ");
    System.out.println("__________________________________________________________________________________");
    System.out.println("Your current balance is " + amount.get(code));
    System.out.println("*********************** ENTER AMOUNT TO DEPOSIT *(in numbers)* ******************** ");
    amount_deposit=in.nextInt();
    amount_deposit = amount.get(code) + amount_deposit;
    amount.set(code, amount_deposit);
    System.out.println("*********************** AMOUNT DEPOSITED SUCCESSFULLY ****************************** ");
    System.out.println(" ");
    System.out.println("YOUR NEW ACCOUNT BALANCE IS "+ amount.get(code)); 

}
}
void withdraw(int codenum, int money)
{
    System.out.println("__________________________________________________________________________________");
    System.out.println("| NAME         |     PHONE NUMBER    |      AADHAR NUMBER    |      ADDRESS      | ");
    System.out.println("__________________________________________________________________________________");
    for(int i=0;i<1;i++)
    {
     for(int j=0;j<4;j++)
    {
        System.out.print("  " + account_Details[codenum][j] + "\t |");   
    }
}
    System.out.println(" ");
    System.out.println("__________________________________________________________________________________");
    if(amount.get(codenum)<money)
    {
        System.out.println( " ");
        System.out.println(" UNABLE TO WITHDRAW BECUASE OF INSUFFICIENT AMOUNT IN YOUR ACCOUNT");
    }
    else
    {
        int withdrawn;
        withdrawn=amount.get(codenum)-money;
        amount.set(codenum, withdrawn);
        System.out.println("*********************** AMOUNT WITHDRAWN SUCCESSFULLY **************************");
        System.out.println( " ");
        System.out.println(" YOUR NEW ACCOUNT BALANCE IS Rs " + amount.get(codenum));

    }
}
void checkBalance(int cod)
{
    System.out.println(" HI! "+ account_Details[cod][0] + " WELCOME BACK");
    System.out.println( " ");
    System.out.println("__________________________________________________________________________________");
    System.out.println(" YOUR ACCOUNT BALACE IS Rs " + amount.get(cod) );

}
void updateAccount(int codi)
{
    int update,c=1;
    
    System.out.println("__________________________________________________________________________________");
    System.out.println("| NAME         |     PHONE NUMBER    |      AADHAR NUMBER    |      ADDRESS      | ");
    System.out.println("__________________________________________________________________________________");
    for(int i=0;i<1;i++)
    {
     for(int j=0;j<4;j++)
    {
        System.out.print("  " + account_Details[codi][j] + "\t |");   
    }
    }
    System.out.println(" ");
    System.out.println("__________________________________________________________________________________");
    while(c == 1)
    {
    System.out.println("************************ UPADTE YOUR ACCOUNT BY PRESSING SERIAL NUMBER ************");
    System.out.println(" 0. NAME  1.PHONE NUMBER  2.AADHAR NUMBER  3.ADDRESS ");
    update=in.nextInt();
    System.out.println(" ");
    System.out.println(" ENTER THE DETAILS TO UPDATE");
    String updatedetails=in.next();
    account_Details[codi][update]=updatedetails;
    System.out.println(" to update another details press '1' ");
    c=in.nextInt();
    }
    System.out.println("************************** ACCOUNT UPDATED SUCCESSFULLY !! ************************"); 
    System.out.println("__________________________________________________________________________________");
    System.out.println("| NAME         |     PHONE NUMBER    |      AADHAR NUMBER    |      ADDRESS      | ");
    System.out.println("__________________________________________________________________________________");
    for(int i=0;i<1;i++)
    {
         for(int j=0;j<4;j++)
         {
          System.out.print(" " + account_Details[codi][j] + "\t |");        
         }
    }
    System.out.println(" ");
    System.out.println("__________________________________________________________________________________");
}
void deleteaccount(int c)
{
    int delete=1;
    System.out.println("************************ ARE YOU SURE WANT TO DELETE YOUR ACCOUNT ******************");
    System.out.println(" ");
    System.out.println("            1.yes or 2.no ?      ");
    delete=in.nextInt();
    if (delete == 1)
     {
         System.out.println(" YOUR ACCOUNT SUCCESSFULLY DELETED !!");
         amount.remove(c);
         System.out.println("__________________________________________________________________________________");
        
    }
    else{
        System.out.println(" OPERATION COMPLETED");
        
    }
}

    public static void main(String[] args)
     {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("\t                          BANKING SYSTEM                              ");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------");
        Banking_System b=new Banking_System();
        int money,operation,choose =1;
        int count=0,code;
        Scanner in=new Scanner(System.in);
        while (choose == 1) 
        {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" CHOOSE THE OPERATION YOU WANTTO PERFORM ");
        System.out.println(" ");
        System.out.println(" 0. ACCOUNT CREATION ");
        System.out.println(" 1. DEPOSIT AMOUNT ");
        System.out.println(" 2. WITHDRAW AMOUNT ");
        System.out.println(" 3. CHECK BALANCE ");
        System.out.println(" 4. UPDATE ACCOUNT ");
        System.out.println(" 5. DELETE ACCOUNT ");
        System.out.println("----------------------------------------------------------------------------");
        operation=in.nextInt();
        switch (operation)
        {
            case 0:
            {
                count++;
                b.account_reation(count);
                break;
            }
            case 1:
            {
                System.out.println(" ENTER YOUR SECRET CODE TO LOGIN ");
                code=in.nextInt();
                b.deposit(code);
                break;
            }
            case 2:
            {
                System.out.println(" ENTER YOUR SECRET CODE TO LOGIN ");
                code=in.nextInt();
                System.out.println("*********************** ENTER AMOUNT TO WITHDRAW  *(in numbers)* ******************** ");
                money=in.nextInt();
                b.withdraw(code,money);
                break;
            }
            case 3:
            {
                System.out.println(" ENTER YOUR SECRET CODE TO LOGIN ");
                code=in.nextInt();
                b.checkBalance(code);
                break;

            }
            case 4:
            {
                System.out.println(" ENTER YOUR SECRET CODE TO LOGIN ");
                code=in.nextInt();
                b.updateAccount(code);
                break;
            }
            case 5:
            {
                System.out.println(" ENTER YOUR SECRET CODE TO LOGIN ");
                code=in.nextInt();
                b.deleteaccount(code);
                break;
            }
        
            default:
            {
                System.out.println(" ENTER THE CORRECT NUMBER ");
                break;
            }
        }
        System.out.println("__________________________________________________________________________________");
        System.out.println("     1 TO CONTINUE                 !!!!!                    0 TO EXIT ");
        choose=in.nextInt();
        System.out.println("__________________________________________________________________________________");
    }

    
}
}
