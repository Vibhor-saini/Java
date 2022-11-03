import java.util.*;
class problem{
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array you want : = ");
    int size = sc.nextInt();


    int[] marks = new int[size];
    //for input   
    for(int i =0;i<size;i++){
        System.out.print("Enter number : = " );
        marks[i]=sc.nextInt();      //for taking marks (jo bhi marks lege vo nxtInt ki help se marks ke index m store hoga)
    }
    

  //for output
    for(int i=0;i<size;i++){
        System.out.println(marks[i]);   //and through this we are printing numbers which is store in marks index.
    }

    System.out.print("Enter number which idex you want to know:= "  );
    int n = sc.nextInt();
    for(int i = 0;i<size;i++){
        if(n==marks[i]){
            System.out.println(n+ " number's index is:= " +i); 
        }
    }
}
}