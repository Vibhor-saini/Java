// this keyword refers to the current object in the  current class or current constructer 1.(third)
// we use this keyword where local and insttanse variable are same 2.(second)
// we can call default cinstructer with the help of this keyword 3.(first)
// we can call parametrized constructer with the help of this keyword.   (below)

class This1{
    This1(){ // default consct...
        this(20);
    }

    This1(int a){  //perametri ....
    
    System.out.println(a);
    }

    public static void main(String args[]) {
    This1 sc = new This1();
    

    }
}