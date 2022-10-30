//differiante btw local and instance var and we know instance var is a part of current obj.
class This3{
int a;   //local var
This3(int a){   //instance var
   this.a=a;
}
void show(){
    System.out.println(a);
}

public static void main(String args[]){
 This3 sc = new This3(23);
 sc.show();
}
}