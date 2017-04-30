
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class File {
    public static void main(String args[]){
        //creates a path to the file
        Path filePath = Paths.get("C:\\Desktop\\testfile.txt");
        //creates a new IputStream 
        InputStream input = null;
        
        //cretes a string to write to the file
        String hello = "Hello, this is my file";
        //creates a byte array of the string
        byte[] data = hello.getBytes();
        //create a new OutputStream
        OutputStream output = null;
        //this try catch will be used just in case the path to the file can't
        //be found
        try{
            //create a new bufferedOutputStream for the file in the specified path
          output = new BufferedOutputStream(Files.newOutputStream(filePath, CREATE));
          //writes the data to the path
          output.write(data);
          //clears out the outputStream
          output.flush();
          //closes the outputStream
          output.close();
        }
        //cathces the exception that will occur if the file is not found
        catch(IOException e)
        {
            //outputs the message if the error is caught
            System.out.println("Message: " + e);
        }
        
        //this try catch will be used just in case the path to the file can't
        //be found
        try{
            //creates an inputStream for the filePath
            input = Files.newInputStream(filePath);
            //creates a bufferedreader to read from the file
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            //creates a string variable to store the content of the file in
            String fileContent = null;
            //stores the fileConent  in the string variable
            fileContent = reader.readLine();
            
            //outputs to the content of the file
            System.out.println(fileContent);
            //closes the input BufferedReader 
            input.close();
            //catches the exception that will be thrown if the file is not found
        }catch(Exception e){
            //outputs the message
            System.out.println("Messgae: " + e);
        }
        
        


        
    }
}
