import java.util.*;
class problem2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();        //take size
        int[] number = new int[size];    //declare array with 

        for(int i = 0;i<size;i++){
          number[i] = sc.nextInt();   //if you want to print sting values then just use sc.next().
        }
        

        int x = sc.nextInt();
        for(int i = 0 ; i<number.length;i++){
        if(x==number[i]){
            System.out.println(x + " is found at index " + i);
        }
    }

    }
}