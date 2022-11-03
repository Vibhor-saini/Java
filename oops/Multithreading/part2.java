// by implementing runnable interface


class A implements Runnable{ 
    
    public void run(){   // run is a method which is already present in Thread class.
       
            for(int i = 1 ; i<=5 ; i++){
                System.out.println("Vibhor saini");
                // Thread.sleep(1000);
             
        } 
     
    }

}
    

class part2{
    public static void main(String args[])   {
     A r=new A();
     Thread t = new Thread(r); 
     t.start();
    for(int i = 1 ; i<=5 ; i++){
        System.out.println("Gaurav saini");
        // Thread.sleep(1000);
     }
}
}