class pattern5{
    public static void main(String args[]){
        int n = 5;
        // outer loop
        for(int i=1 ;i<=n ;i++){
            // inner loop
            for(int j=1 ;j<=n-i; j++){
               System.out.print(" ");
            }
                                            
            for(int k = i;k>=1 ; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
    }