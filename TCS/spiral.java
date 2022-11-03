import java.util.*;
class spiral{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] matrix = new int[R][C];
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
            matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    
        //output
        for(int i = 0;i<R;i++){
            for(int j = 0;j<C;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        // System.out.println("Transform matrix is : ");
        

            //transform
            // for(int i = 0;i<R;i++){
            //     for(int j = 0;j<C;j++){
            //     System.out.print(matrix[j][i]+ " ");
            //     }
            //     System.out.println();
            // }
                int rowstart = 0;
                int rowend = R-1;
                int colstart = 0;
                int colend = C-1;
               

                // To print spiral order matrix

                while(rowstart<=rowend&&colstart<=colend){
                
                //1
                for(int col = colstart;col<=colend;col++){               //i for when row is no change row and j for when col is no change.
                
                System.out.print(matrix[rowstart][col]+" ");   //coloum(col) is changing
                    
                }
                rowstart++;

                //2
                for(int row = rowstart;row<=rowend;row++){    //row is changing
                
                    System.out.print(matrix[row][colend]+" ");
                        
                    }
                    colend--;

                     //3

                       for(int col = colend;col>=colstart;col--){
                
                        System.out.print(matrix[rowend][col]+" ");  //arr[R][C change]
                            
                        }
                        rowend--;

                      //4
                    
                        for(int row = rowend;row>=rowstart;row--){
                
                            System.out.print(matrix[row][colstart]+" ");
                                
                            }
                            colstart++;

                            
                        }
                        System.out.println();
        }
    }

