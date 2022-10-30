// In default constructer andparametrized constructer

class A{   //super class
    // A()
    A(int a)
    {
    System.out.println("hello buddy" +" "+ a);
    
    }

}

class B extends A{    //sub class
    
    B()
    {
    
        //by default(IN defayt constructer) superkeyword
    super(10);
    System.out.println("hello vibhor");
    
    }
}

class superkeyword2{
    public static void main(String args[]){
      B sc = new B();
      
    }
}

// Note : - In default constructer there is no need to write superkeyword but in parametrized constructer their is need!