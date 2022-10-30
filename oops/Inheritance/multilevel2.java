

class A{   // Super class
     int a,b,c;    
      void add(){
      a = 20; b=30;
      c = a+b;
        System.out.println("Add of two number is: " + c);
    }
      void sub(){
     a=200; b=100;
      c = a-b;
        System.out.println("sub of two number is: " + c);
    }
}

class B extends A{   //sub class
    void mul(){
        a = 100; b= 2;
        c = a*b;
        System.out.println("multiplication of two num is: " + c);
    }
    void Div(){
        a = 100; b= 2;
        c = a/b;
        System.out.println("Dividation of two num is: " + c);
    }
}

    class C extends B{   //sub class
        void rem(){
            a = 100; b= 3;
            c = a%b;
            System.out.println("Remainder of two num is: " + c);
        }
    }

    class multilevel2{
    public static void main(String args[]){
     C r = new C();
     r.add();
     r.sub();
     r.mul();
     r.Div();
     r.rem();
    }
}
