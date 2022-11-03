class parseint{
    public static void main(String args[]) {


       //String to integer
        String str = "12345";
        int number = Integer.parseInt(str);
        System.out.println(number);
        int a = 4;
        int c = 4;
        int b = (c +  a);
        System.out.println(b);

        //integer to String
        int num = 12345;
        String Number = Integer.toString(num);
        System.out.println(Number);
        System.out.println(Number.length());
        
    }
}