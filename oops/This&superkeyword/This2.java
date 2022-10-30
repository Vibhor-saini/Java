// this keyword refers to the same current object.

class This2{

    void show(){
        System.out.println(this);  
    }                                            
    public static void main(String args[]){      
        This2 sc = new This2();
        System.out.println(sc);
        sc.show();
    }
}

// if we want to get unique referense number of the class the we have to declare object  of the current class.