import java.util.*;
class InsertionSort{
    public static void main(String[] args) {
        int a[] = {23,12,4,323,5,3,2};
        int n = a.length , j , temp;

        for(int i = 1 ; i<n; i++){
            temp=a[i];   //temp = 12
                 j=i;   // j = 1
                 while(j>0 && a[j-1]>temp){
                     a[j]=a[j-1];    //a[1] = 23
                     j-=1 ;   // j = j-1  decrease by 1

                }
                     a[j]=temp;
        }

        for(int i=0; i<n ; i++){
        System.out.print(a[i] + " ");
        }
    }
}