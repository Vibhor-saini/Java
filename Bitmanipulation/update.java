import java.util.*;
class update{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt(); // should be 1 or 0

        // or 
        
        // int n = 5; // 0101   get = 2 index number.
        // int pos = 2; // means index = 2

       
        int bitMask = 1<<pos;

        if(pos == 1){ // for set
        int NewNumber = bitMask|n;
        System.out.println(NewNumber);
        }

        else{// for clear
        int Newbitmask = ~ (bitMask);
        int NewNumber = Newbitmask&n;
        System.out.println(NewNumber);

        }
        

        
    }
}