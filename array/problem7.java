import java.util.*;
class problem7{
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
         
          int min = Integer.MAX_VALUE;
          
          for(int i = 0;i<size;i++){
            if(min>numbers[i]){
                min = numbers[i];
            }
          }
        System.out.println("Minimum number is:=  "+min);

        
         
        

    }
}