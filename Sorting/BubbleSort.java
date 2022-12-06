                     //without function



import java.util.*;
class BubbleSort{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter the size of the array: ");
      int size = sc.nextInt();
      int arr[] = new int[size];
      

      System.out.println("Enter the number of the array which you want to sort : ");
      for(int i = 0 ; i<size ; i++){
        arr[i]  =  sc.nextInt();  
      }
      
      // int n = arr.length;
       int temp = 0;
      
      System.out.println("Array before sorting : " );
      for(int i = 0 ;i < size ; i++){
          System.out.print(arr[i] + " ");        
         }
            int flag=0;
           for(int i = 0 ; i<size ; i++){
             for(int j = 0 ; j<size-1-i ; j++){            
              if(arr[j]>arr[j+1]){
               temp = arr[j+1];
              arr[j+1] = arr[j];
              arr[j] =temp;

              flag =1;
            }
        }
        if(flag==0){
          break;
        }
      }
    System.out.print("\n"+"Array after sorting : " + "\n");
       for(int i = 0 ;i < size; i++){
         System.out.print(arr[i] + " ");
         
      
    }
}
}