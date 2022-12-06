class bub{
    public static void main(String[] args) {
        int[] a = {23,12,9,34,11};    //temp = 12
      int n = a.length;
       
      for(int i = 1; i<n ; i++){
          int temp = a[i];
          int j = i;    //j = 1
          while(j>0 && temp<a[j-1]){    // 12 < a[1-1] , 12 < a[0]  , 12 < 23
            a[j] = a[j-1];
             j = j-1;  // j = 0
            }
            a[j]=temp;
      }
        for(int i = 0 ; i<n ; i++){
            System.out.print(a[i] + " ");
        }
    }
}