import java.util.Scanner;
class pattern17_1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number = ");
       int m = sc.nextInt();
    
       for(int i =1; i<=m; i++){
        for(int j = 1; j<=m; j++){
            if(i+j==6||i-j==4||j-i==4||i+j==14){
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