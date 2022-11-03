class stringbuilder{
    public static void main(String args[]){
        // StringBuilder str = "vibhor";  //this is wrong!

        //declaration
        // StringBuilder str = new StringBuilder("vibhor");
        // System.out.println(str);

        StringBuilder str = new StringBuilder("v");
        str.append("i");   // In string str = str + "i";   every time new string will be create.
        str.append("b");
        str.append("h");
        str.append("o");
        str.append("r"); // But in stringbuilder no new string will be create.
        System.out.println(str);

        //for length()
        System.out.println(str.length());
        

        // for print index character

        // System.out.println(str.charAt(1));

        // //for set character at index

        // str.setCharAt(1, 'e');
        // System.out.println(str);

        // //for insert at index

        // str.insert(0,'s');
        // System.out.println(str);

        // str.insert(1,'k');
        // System.out.println(str);

        // //for delete character

        // str.delete(1,3);
        // System.out.println(str);

        // str.delete(0,1);
        // System.out.println(str);

        // //use of string builder

    }
}