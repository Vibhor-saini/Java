interface A{   //super
    void show();
}

interface B{   //super
    void show();
}
// interface B{   //super
//     void disp();
// }

class Multiple3 implements A,B{   // sub
   public void show(){
        System.out.println("Interface A & B ");
    }

//    public void disp(){
//         System.out.println("Interface  B");
//     }
    public static void main(String args[]){
        Multiple3 s = new Multiple3();
        s.show();
        // s.disp();
    }
}