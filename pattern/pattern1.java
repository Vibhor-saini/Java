import java.util.*;
class pattern1{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);     
    int m ;
    System.out.print("Enter the number of rows = ");
    m = sc.nextInt();
    int n ;
    System.out.print("Enter the number of colums = ");
    n = sc.nextInt();
    //outer loop
    for(int i= 1; i<= m; i ++){  
     //inner loop                             // it is called nested loop
        for(int j= 1; j<=n; j++){;          // loop ke ander loop
        System.out.print("*");
        }
        System.out.println();
    }
 }
}