import java.util.*;
class array{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size , i ;
    int temp=0;
    System.out.print("Enter the size of the array: = ");
    size = sc.nextInt();
    int[] numbers = new int[size];
    // for input array
    for(i=0;i<size;i++){
        numbers[i] = sc.nextInt();
    }
      
    // display element of the original array
    for(i=0;i<size;i++){
        System.out.println("The numbers is := " + numbers[i]);
    }

    boolean isAscending = true;
         
    for(i=1; i<size-2; i++){
        
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
              
            }
        
    }

    if(isAscending){
     System.out.println("Ascending  m hai");
            
         }
         else{
            System.out.println("Ascending m nhi hai");
         }
         }
    }
