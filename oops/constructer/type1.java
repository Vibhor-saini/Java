                        //Default constructor
// package oops;
class c{
    int a ; String b ;boolean d;
    c(){       //default constructer
     a = 100;
     b= "vibhor Saini";
     d = true;
    }
    void disp(){
        System.out.println(a+" "+b+" "+d);
    }
}


class type1{
    public static void main(String args[]){
    c obj = new c();  // obj of the default cons..
    obj.disp();  
    }
}