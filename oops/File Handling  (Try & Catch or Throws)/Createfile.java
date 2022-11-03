import java.io.*;
class Createfile{
public static void main(String args[]) throws IOException {
    File f = new File("C:\\Users\\JANTA\\Desktop\\NewFile1.txt");   //File is a class in io package.
    
    if(f.createNewFile()){
    System.out.println("File create successfully...!");
    }
    else{
        System.out.println("File already exist...!");
    }
}
}

