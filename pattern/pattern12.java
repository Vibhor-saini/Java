class pattern12{
    public static void main(String args[]){
        
       int m =5;
       
       for(int i =1; i<=m; i++){
        //spaces
        for(int j = 1; j<=m-i; j++){
            System.out.print(" ");
        }
        
        //first part
        for(int j = i; j>=1; j--){
        System.out.print(j);

        }

        //second part
        for(int j = 2; j<=i; j++){
            System.out.print(j );
        }

        System.out.println();
       }
    }
}