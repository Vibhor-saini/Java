import java.util.*;

class BubbleSort1{

    public static void  BubbleSort(int array[] , int n){

        
           for( int i = 0 ; i<n ; i++){
            System.out.println(array[i] + " ");
          }
       }
     
   
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        int n = array.length;

        for( int i = 0 ; i<n ; i++){
            array[i] = sc.nextInt();
          }
 
          int temp;
          int flag = 0;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n-1-i ; j++){            
             
             if(array[j]>array[j+1]){
             temp = array[j+1];
             array[j+1] = array[j];
             array[j] = temp;
             flag = 1;
           }
      
        }
        if(flag==0){
          break;
        }
    }
    BubbleSort(array,n);
}
}