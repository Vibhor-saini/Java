import java.util.*;
class problem3{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of fruits names:= ");
    int size = sc.nextInt();

    String[] fruits = new String[size];


       //for input
    for(int i=0;i<size;i++){
         fruits[i]=sc.next();       
    }
   
    //  output
    for(int i=0 ; i<size;i++){
        System.out.println("name  is " + (i+1) + fruits[i]);   //(i+1) because if i then will print o,1,2 wih name but we want 1,2,3 so.
    }

}
}