//when variable name is same.

class A{   //super class
    int a = 10;

}

class B extends A{    //sub class
    int a = 20;
    void show()
    {
    System.out.println(a);
    System.out.println(super.a);
    }
}

class superkeyword{
    public static void main(String args[]){
      B sc = new B();
      sc.show();
    }
}