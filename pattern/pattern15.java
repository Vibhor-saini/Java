class pattern15{
    public static void main(String args[]){
        
       int n = 5;
       int i ,j;
       for(i=1;i<=n;i++){

        for(j=1;j<i;j++){
            System.out.print(" ");
        }
        for (j=i; j<=n; j++){       //2,3,4,5
            System.out.print("*");
        }
        
        System.out.println();
       }
    }
}