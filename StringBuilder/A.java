class A{
    public static void main(String args[]){
        //1st method
        StringBuilder s = new StringBuilder("Vibhor saini");
        System.out.println(s.reverse());

        //2nd method
        StringBuffer r = new StringBuffer("Saini");
        System.out.println(r.reverse());


        //3rd method
        String k = "sugandha";
        String l = " ";
        for(int i = k.length()-1; i>=0;i--){
        l = l + k.charAt(i);
        }
        System.out.println(l);
    }
}