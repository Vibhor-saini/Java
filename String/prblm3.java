import java.util.*;
class prblm3{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the E-mail id : = ");
    String original = sc.next();
    System.out.println("The original E-mail id is : = " + original);
    
    // int result = result('g','f')  // when you not take string grom the user.
    String result = " ";    //   like int a = 0; but in string we can do like this .
    for(int j = 0; j<original.length(); j++){
        if(original.charAt(j)=='@'){
         break;
        }
        {
            result = result + original.charAt(j);
        }
        //    else{
        //     result = result + original.charAt(j);
        // }
    }
    System.out.println("The user name is := " + result);
    
}
}
