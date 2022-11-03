class pattern25{
    public static void main(String args[]){
        int n = 10, i, j , k , l;
        for(i=1;i<=n;i++){   //fot row
            for(j=1;j<=n-i;j++){               
            System.out.print(" ");
        }
        for( k = 1 ; k<=i ; k++){
        System.out.print("*");
    }
    for( l=2;l<=i;l++){
        System.out.print("*");
    }

   // For reverse

    for(i=n-1;i<=6;i--){   //fo row
        for(j=1;j>=n;j++){               
        System.out.print(" ");
    }
    for( k = 1 ; k<=i ; k++){
    System.out.print("*");
}
for( l=2;l<=i;l++){
    System.out.print("*");
}
   
    System.out.println();
    }
    }
}