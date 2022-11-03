import java.util.*;
class prblm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //string array
        int size = sc.nextInt();
        String array[] = new String[size];

        int totlength = 0;
        
        for(int i=0;i<size;i++){
            array[i] = sc.next();   //not nextInt()
            totlength = totlength + array[i].length();
           }
         System.out.println(totlength);

        // String c = a +" " + b;
        // System.out.println("The string is : = " + c);

        // System.out.println(c.length());
    }
}