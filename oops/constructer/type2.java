                    //Parameterized constructor
package oops;
class c{
int x ; int y; String k; int l;
   c(int a , int b){
    x = a;
    y = b;
   }
   void show(){
    System.out.println(x+" "+y);
   }

   c(int e , String d){
     l = e;
     k = d;
     System.out.println(e+" "+d);
   }
           //or
//   void shows(){
//       System.out.println(l+" "+k);
//   }  
}

class type2{
    public static void main(String args[]){
        c obj = new c(20,30);
        c obj1 = new c(40,"vibhor");
        obj.show();  // for x , y
//        obj1.shows();    // for a , b
       
    }
}