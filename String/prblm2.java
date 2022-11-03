import java.util.*;
class prblm2{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: = ");
    String original = sc.next();
    System.out.println("The original string is : = " + original);
    
    // int result = result('g','f')  // when you not take string grom the user.
    String result = " ";    //   like int a = 0; but in string we can do like this .
    for(int j = 0; j<original.length(); j++){
        if(original.charAt(j)=='e'){

            result = result + 'i';
        }
           else{
            result = result + original.charAt(j);
        }
    }
    System.out.println("The new string is := " + result);
    
}
}
