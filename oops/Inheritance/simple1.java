class student{   // Super class
    //  protected int roll,marks;
     int roll,marks;
      protected String name;
    //  private void input(){     //not valid coz of private member we can not inherit.
        // but we can use protected insted of private.
      void input(){
        System.out.println("Enter roll name and marks: ");
    }
}

class simple1 extends student{   //sub class
    void disp(){
        roll = 23;
        marks = 45;
        name = "vibhor saini";
        System.out.println(roll+" "+ marks+" "+ name);
    }

    public static void main(String args[]){
     simple1 r = new simple1();
     r.input();
     r.disp();
    }
}