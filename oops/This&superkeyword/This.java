// this keyword refers to the current object in the  current class or current constructer 1.(third)
// we use this keyword where local and insttanse variable are same 2.(second)
// we can call default cinstructer with the help of this keyword 3.(below)

class This{
    This(){ // default consct...
        System.out.println("This is vibhor saini");
    }

    This(int a){  //perametri ....
    this();   //Magic
    System.out.println(a);
    }

    public static void main(String args[]) {
    This sc = new This(67);
    

    }
}