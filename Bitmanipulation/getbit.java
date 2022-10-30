import java.util.*;
class getbit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        // or 
        
        // int n = 5; // 0101   get = 2 index number.
        // int pos = 2; // means index = 2
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}