import java.util.*;
class revision{
    public static void main(String args[]){
        int n , c, s=0 , rem;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
                  
        //check number is palindrom or not! /  121 is palindrom number .
        c=n;
        while(n>0){
          rem=n%10;
          s=  10*s+rem;
          n=n/10;
        }
        if(c==s){
            System.out.println("Number is palindrom");
        }
        else{
            System.out.println("Number is not palindrom");
        }
        }

        
                  
          
        //Check number is prime or not!    37 is prime number.
        //      for(i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        //      if(count==2){
        //         System.out.println("Number is prime number!");
        //     }
        //     else{
        //         System.out.println("Number is not prime number!");
        //     }


         //check armstrong or not!  153
        //  c=n;
        //  while(n>0){
        //     rem=n%10;
        //     arm = rem*rem*rem+arm;
        //     n=n/10;
        //  }
        //  if(c==arm){
        //     System.out.println("The number is armstrong number!");
        //  }
        //  else{
        //     System.out.println("The number is not armstrong number!");
        //  }
        
        } 

    
