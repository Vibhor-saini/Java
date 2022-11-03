//We can not perform method overridding without inheritance.
                                      // Method Overriding
 class shape{
    void draw(){
        System.out.println("Can't Say about shape type");
    }
 }   
 
 class square extends shape{
    @Override
    void draw(){
        super.draw();       // Super keyword.
        System.out.println("square shape");
    }
 }

 class Runtime{
    public static void main(String args[]){
        // square r = new square();   
        shape r = new square();   //object sub class and refernce super class.
        r.draw();
    }
 }