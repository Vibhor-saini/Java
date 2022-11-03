class pat25{
    public static void main(String args[]){
        int n = 9, i, j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1&&j==5||i==2&&j>3&&j<7||i==3&&j>2&&j<8||i==4&&j>1&&j<9||i==5||i==6&&j>1&&j<9||i==7&&j>2&&j<8||i==8&&j>3&&j<7||i==9&&j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }