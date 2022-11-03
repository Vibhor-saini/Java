//  By extending thread class

class A extends Thread{ 
    @Override
    public void run(){   // run is a method which is already present in Thread class.
        try {
            for(int i = 1 ; i<=5 ; i++){
                System.out.println("Vibhor saini");
                Thread.sleep(1000);
             }
        } catch (Exception e) {
            // TODO: handle exception
        }
     
    }

}
    

class part1{
    public static void main(String args[])  throws InterruptedException {
    A t=new A();
    t.start();   //for start the thread we use start method which is already define in thread class.
    for(int i = 1 ; i<=5 ; i++){
        System.out.println("Gaurav saini");
        Thread.sleep(1000);
     }
}
}