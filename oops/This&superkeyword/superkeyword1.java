//when method name is same.

class A{   //super class
    void show()
    {
    System.out.println("hello buddy");
    
    }

}

class B extends A{    //sub class
    
    void show()
    {
        super.show();
    System.out.println("hello vibhor");
    
    }
}

class superkeyword1{
    public static void main(String args[]){
      B sc = new B();
      sc.show();
    }
}