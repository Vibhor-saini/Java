import java.util.*;
class problem6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : =");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //input
        for(int i=0;i<size;i++){
            System.out.print("Enter the num: ");
            numbers[i] = sc.nextInt(); 
        }
         
          int min = numbers[0];
          int max = numbers[0];
          for(int i=1;i<size;i++){
            if(min>numbers[i]){
                min = numbers[i];
            }
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Minimum number is:=  "+min);       
        System.out.println("Maximum number is:=  "+max);       
        
    }
}