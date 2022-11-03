class pattern14{
    public static void main(String args[]){
        int n = 4;
        int i , j ,k;

        for(i=1;i<=n;i++){

            //first part
        for(j=1;j<=i;j++){
            System.out.print("*");
        }

        // spaces
        int spaces = 2*(n-i);
        for(k=1;k<=spaces;k++){      //1<=6,2<=6,3<=6,4<=6,5<=6,6<=6,7<=6(false)
            System.out.print(" ");
        }

        //2nd part
         for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    
        } 

        //lower half
        for(i=n-1;i>=1;i--){

            //first part
        if(i||){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
    }

        // spaces
        int spaces = 2*(n-i);
        for(k=1;k<=spaces;k++){      //1<=6,2<=6,3<=6,4<=6,5<=6,6<=6,7<=6(false)
            System.out.print(" ");
        }

        //2nd part
         for(j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        
    }      
}









