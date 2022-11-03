import java.util.*;
class problem4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt(); 
        }
    
         int max = Integer.MIN_VALUE;   // both are  property of integer
         int min = Integer.MAX_VALUE;
  
          for (int i = 0;i<size;i++){
            if(numbers[i] < min){
                min = numbers[i];
                
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
          }
          System.out.println("largest num is" + max);
          System.out.println("smallest num is" + min);

    }
}