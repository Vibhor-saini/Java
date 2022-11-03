                   //Write in file.
import java.io.*;                  
class add{
    public static void main(String args[]){
        try
        {
        FileWriter f = new FileWriter("c:\\Users\\JANTA\\Desktop\\MyFile3.txt");
        try{
        f.write("I am Learning Java Programming Write Now ....");
         }
        finally
        {
         f.close();
        }
        System.out.println("Sucessfully wrote in the file...");
        }
    
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}



