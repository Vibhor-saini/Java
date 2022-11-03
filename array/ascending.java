import java.util.*;
class ascending{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int size , i , j;
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

    
    // for sort the array      i[0]=2,j[1]=4,3,22,6 ----->   2,3,4,6,22
    for(i=0; i<size; i++){
        for(j=i+1; j<size; j++){
            if(numbers[i]>numbers[j]){
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
              
            }
        }
    }
    System.out.println();
         //displaying elements of the array after sorting
         System.out.println("Elements of array sorted in ascending order: ");
         for(i=0;i<size;i++){
            System.out.println(numbers[i] + " ");
         }
    }
}