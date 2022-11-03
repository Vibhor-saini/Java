class pattern22{
public static void main(String args[]){
    int n = 16 , i, j;
    for(i=1;i<=n-11;i++){
        for(j=1;j<=n;j++){
            if(j==1||j==4||j>1&&j<4&&i==3||i==1&&j>6&&j<10||j==8&&i>1&&i<5||i==5&&j>6&&j<10||j==12||j==16||j>12&&j<16&&j-i==11&&i<4||i==2&&j==15){
                System.out.print("|");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}