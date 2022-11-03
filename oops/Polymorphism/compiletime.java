                              /*  Compile time (Method Overloading) */
  //we have to make object of the main class coz with object we can not acces method of the main class.                            

class compiletime{

void add(){
    int a = 10 ; int b = 20; int c;
    c = a+b;
    System.out.println(c);
}

// void add(int x , int y){
int add(int x , int y){
int c = x + y;
return c;
    // System.out.println(c);
}

void add(int a , double b){
  double c = a  *b;
  System.out.println(c);
}

public static void main(String args[]){
    compiletime c = new compiletime();
    c.add();
    int k =  c.add(67 , 89);   //though int
    System.out.println(k);
    c.add(45,2.5);
    }

}


