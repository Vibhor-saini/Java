import java.util.*;
abstract class animal{
    void legs(){
        System.out.println("All animals have 4 legs");
    }
    void eyes(){
        System.out.println("All animals have 2 eyes");
    }

    abstract void sound();  // coz we dont know the name of the animal.
    abstract void eat();
}

class Dog extends animal{

    @Override
    void sound(){
        System.out.println("Barks");
    }

    void eat(){
        System.out.println("Meat");
    }
}

class cow extends animal{

    @Override
    void sound(){
        System.out.println("oooooo oooo");
    }

    void eat(){
        System.out.println("Grass");
    }
}
class absclass{

    public static void main(String args[]){
     Dog d = new Dog();
     cow c = new cow();

     d.sound();
     c.sound();
     d.eat();
     c.eat();
    //  d.legs();
    //  c.legs();
     d.eyes();
     c.legs();

    }
}