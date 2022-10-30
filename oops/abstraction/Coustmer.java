//abstraction means = Hiding the essintial information + highlight the set of services.
// Bank: sevices = deposite , checkbal , withdraw. but not can see(Hide) backend(code) process(for security purpose).
// Car: service = horn , break , etc .

// Encaptulation is use for security purpose means encaptulation =  Data hide + service show(abstraction)
// data member(variables) always will be private and method should be public.
//Note: a class will be abstract if inside that class any method is abstract.
//Note: to stop the execution of the code in if statement use (return).
import java.util.Scanner;

 abstract class Bank{

    public String Name = "SBI";
    public String IFSC = "SBI123";
    
    public void bankDetail(){
        System.out.println("Bank Name " + Name + " " + " Bank_IFSC Code " + IFSC);
    }

    abstract void Deposite();
    abstract void Withdraw();
    abstract void Checkbal();

}

    class bankService extends Bank
  {

 private double bal= 5000;
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

 public void Withdraw(){    
    System.out.print(" Enter password");
    Scanner sc = new Scanner(System.in);
    pwd = sc.nextInt();
    if(pwd==123){
        System.out.print("Enter money you want to deposite: ");
             Money = sc.nextInt();
             if(Money>bal){
                System.out.println("Insufficent Balance.");
                return;
            } 
                     
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


class Coustmer{
    public static void main(String args[]){
        bankService b = new bankService();
        b.bankDetail();
        // System.out.print(b.bal);  //if bal is not private.
        
        int ch;
        // int Money;
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
                b.Withdraw();
                break;

            case 3:
                b.Checkbal();
                break;
        
            default:
            System.out.println("invalid choice");
                break;
        }
        // b.Deposit(1000);

    }
  }
