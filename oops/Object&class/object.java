
public class object {

    int age = 21;
    int weight = 45;             // this is property
    String color = "white";
    String work ="vella";
    
    void eat(){
        System.out.println("I'm Eating");   // this is behaviour
    }
    
    void teaching(){
            System.out.println("I'm teaching");
    }
    
    public static void main(String args[]) {
        object sc = new object();
        System.out.println(sc.age);
        System.out.println(sc.weight);
        System.out.println(sc.color);
        System.out.println(sc.work);
        
        sc.eat();
        sc.teaching();
//        sc.work();
        

    }
}
