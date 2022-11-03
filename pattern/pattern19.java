import java.util.Scanner;
class pattern19{ 
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number = ");
       int m = sc.nextInt();
        
        for(int i=1;i<=3;i++){
            for(int j = 1;j<=5;j++){
            if(i+j==m-1||i==m/2+1||j-i==m-3){
           System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        
    }
    System.out.println();
            
                   
}
        }
    }

    
