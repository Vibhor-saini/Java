// Encaptulation is use for security purpose means encaptulation =  Data hide + service show(abstraction)
// data member(variables) always will be private and method shou be public.

import java.util.*;

class bank{

 private double bal= 20000;
 private int pwd;
 public int Money;
 
 public void Deposite(){   
    System.out.print(" Enter password");
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();
    if(pwd==123){
        System.out.print("Enter money you want to deposite: ");
        Money = sc.nextInt();
        bal = bal+ Money;
        System.out.println("Deposit Money:" + Money);
        System.out.println("Total Balance:" + bal);
    }
    else{
        System.out.println(" Envalid Password..");
    }
    
    
    
 }

 public void Withdraw(double Money){    
    System.out.print(" Enter password");
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();
    if(pwd==123){
        System.out.print("Enter money you want to deposite: ");
             Money = sc.nextInt();
        bal = bal-Money;
        System.out.println("Deposit Money:" + Money);
        System.out.println("Total Balance:" + bal);
    }
    else{
        System.out.println(" Envalid Password");
    }
    
    
 }

 public void Checkbal(){    
    System.out.print(" Enter password"); //For take password
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();

    if(pwd==123){
        System.out.println("Total Balance:" + bal);
    }
    else{
        System.out.println("Envalid Password..");
    }
    
 }

}

class customer{
    public static void main(String args[]){
        bank b = new bank();
        // System.out.print(b.bal);  //if bal is not private.
        
        int ch;
        int Money;
        System.out.println("Dear custmer we provide three services");
        System.out.println("1. Deposite:");
        System.out.println("2. Withdraw:");
        System.out.println("3. Checkbalance:");

        System.out.print(" Enter your choice:");   //For Take Input
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();
        
        switch (ch) {
            
            case 1:          
                b.Deposite();
                break;

            case 2:
                b.Withdraw(2000);
                break;

            case 3:
                b.Checkbal();
                break;
        
            default:
            System.out.println("Envalid choice");
                break;
        }
        // b.Deposit(1000);

    }
}