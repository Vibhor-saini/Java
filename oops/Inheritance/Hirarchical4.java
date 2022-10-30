class A{  //super
 void input(){
    System.out.println("Enter your name: ");
 }
}

class B extends A{
   void show(){
    System.out.println("My name is vibhor saini");
   }
}

class C extends A{
   void disp(){
    System.out.println("My name is himanshu ");
   }
}

class Hirarchical4{
    public static void main(String args[]){
        B r1 = new B();
        C r2 = new C();
        r1.input();
        r1.show();
        r2.input();
        r2.disp();
    }
}