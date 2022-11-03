import java.util.*;
class funonstring{
    public static void main(String args[]){        
       Scanner sc = new Scanner(System.in);
       //Concatenation
    //    System.out.print("Enter your first name := ");
       String firstname =("Mr.vibhor");

    //    String firstname = sc.nextLine();
    
       
    //    System.out.print("Enter your last name := ");
       String lastname = "saini";

    //    String lastname = sc.nextLine();
    

       String fullname = firstname +" "+ lastname;

       System.out.println("Your Full Name is = " + fullname );

       // For substring , we want to print fullname substring below , we will store fullname string in another string first.
       String name = fullname.substring(0,12);  //it will run always (length-1)
       System.out.println(name);

       //Length
       System.out.println(fullname.length());

       //charAt() --- predefine method
    //    for(int i =0;i<fullname.length();i++){
    //     System.out.println(fullname.charAt(i));
    //    }

       //compareTo()

    //    if(firstname == lastname){
    //     System.out.println("String are equal");
    //    }else{
    //     System.out.println("String are not equal");
    //    }
       
    //    if(firstname.compareTo(lastname)==0){
    //     System.out.println("Strinf are equal");
    //    }else{
    //     System.out.println("Strinf are not equal");

    //    }

    //New string
    //note:= always use .compareTo function instead of ==

    //  if(new String("vibhor") == new String("vibhor")){
    //     System.out.println("String are equal");
    //  }else{
    //     System.out.println("String are not equal");
    //  }
     
       

    }
}