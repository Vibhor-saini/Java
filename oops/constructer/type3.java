                //Copy constructor
package oops;
class C{
    int a; String  b;
    C(){
    a = 400;
    b = "Vibhor Saini";
    System.out.println(a+" "+b);
    }

    C(C ref){   //copy cont...
      a = ref.a;
      b = ref.b;
      System.out.println(a+" "+b);
    } 

}

class type3{
    public static void main(String args[]){
    C obj = new C();
    C obj1 = new C(obj);

    }
}