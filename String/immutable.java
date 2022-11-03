class immutable{
    public static void main(String args[]){
        String str = "vibhor";   //immutable can't change
        // str.concat(" saini");     //immutable can't change

        String str1 = str.concat(" saini");    // through copy
        
        System.out.println(str1);
    }
}