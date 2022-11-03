class pattern2{
public static void main(String args[]){
int m = 5;
int n = 5;
for(int i= 1; i<=m ; i ++){
    for( int j= 1; j<=n; j++){
        //cell-> (i,j) (1,1)(1,2)(1,3)(1,4)(1,5) or 
    if(i==1||i==m||j==1||j==n){
        System.out.print("* ");
    }else{
        System.out.print("  ");
    }
    }
    System.out.println();
}
}
}