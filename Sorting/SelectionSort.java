import java.util.*;
class SelectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        // int n = a.length;

        for(int i = 0 ; i<a.length ; i++){
        a[i] = sc.nextInt();
        }

          int min=0 ; int temp = 0;
        for(int i = 0;i<a.length; i++){
            min = i;
            for(int j = i+1 ; j<a.length; j++){
               if(a[j]<a[min]){
               min = j;
               }
            }
            temp = a[i];
            a[i] = a[min];
             a[min]=temp;
        }
        for(int i = 0;i<a.length ; i++){
            System.out.print(a[i]+ " ");
        }
    }
}