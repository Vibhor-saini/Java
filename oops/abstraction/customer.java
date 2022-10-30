import java.util.*;


interface vehical{       
    String Name = "BAJAJ"; //by default public + static + final
    int speed = 100;       //by default public + static + final

    void start();   //by default public + abstract
    void stop();    //by default public + abstract
    // default void Color()    //In popular jdk 8.1
    // {
    //  System.out.print( "color is red");
    // }

    // static void speeds(){   // in new jdk(8.1)
    //     System.out.println("Speed is 100km/h"); 
    // }

}


class customer implements vehical{      //customer is a main class of the program.

    @Override   //recall
    public void start(){
        // Name = "Honda";     //means final.
        System.out.println("Start(): insert key & press start button");
    }

    @Override   //recall
    public void stop(){
        System.out.println(" Stop(): exit key " + Name);  // add Name to check public or not.
    }

    public static void main(String args[]){
    customer c = new customer();
    c.start();
    c.stop();
    // c.Color();
    // vehical.speeds();
    System.out.println(speed);   //it means static
    System.out.println(Name);   //it means static
  
    }
}
 
// Note : We can implement static and default method inside the interface.