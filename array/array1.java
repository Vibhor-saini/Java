class array1{
    public static void main(String args[]){
    //  SYNTAX --  type[] array-name = new type[3]

    // int[] marks = {67,99,80,33,45,67};
    // marks[1]=100;                   //we can change array element throw this in place of 99 here is 100.
    // System.out.println(marks[1]);   //for access the element from the array
    // System.out.println(marks.length);   //for access the ength of the array
    

    // String[] cars = {"BMW" , "SWIFT" , "ALTO"};  //[0 , 1 , 3]
    // System.out.println(cars[2]);     ////for access the element from the array(ALTO)


                                 //OR

    int[] marks = new int[4]; //if int[3] then 50 will show instead of 81
    marks[0] = 79;
    marks[1] = 80;
    marks[2] = 81;   //  if marks[2] = 81 and for this it wil show 0 which is garbage value in java.
    marks[3] = 50;

    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // System.out.println(marks[1]);    //always last condition will be valid which is 50 not 78

                                         //OR

    // for(int i=0;i<=3;i++){
    //     System.out.println(marks[i]);
    // }
                                        //OR

     for(int i : marks){
        System.out.println(i);    //this is too easy yeeee!
     }                                    
}
}