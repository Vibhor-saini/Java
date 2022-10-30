class Instancevsstaticblock{
    //  static{  //static bolck
//    static int a = 67 ;  static int b = 78;
        int a = 67 ; int b = 78;
     {  //instance block
        
        System.out.println("hyy vibhor" + a + b);
    }
    public static void main(String args[]) {
        Instancevsstaticblock sc = new Instancevsstaticblock();
        // Instancevsstaticblock sc = new Instancevsstaticblock();  //no need when static
    }

}