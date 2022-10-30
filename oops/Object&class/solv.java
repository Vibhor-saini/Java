class C{
    int x; int y;
    C(int a,int b ){
    x=a;
    y=b;
    System.out.println(x+" "+y);
    }
    
    C(C ref){
       int a=ref.x;
       int b=ref.y;
        System.out.println(a+" "+b);
    }
}


class solv{
 public static void main(String args[]){
  C obj = new C(12,24);
  C obj1 = new C(obj);
  
 }
}