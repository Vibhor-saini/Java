import java.util.*;
class pattern24{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int  i, j , k , l;
    // n = 5
    for(i=1;i<=n;i++){   // for row
        for(j=1;j<=n-i;j++){     // for space
         System.out.print(" ");  
        }
        for(k= 1;k<=i; k++ ){   //for star
         System.out.print("*");
        }
        for(l=2;l<=i; l++ ){   //for star
         System.out.print("*");
        }
 System.out.println();
        }
    }
}