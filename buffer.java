package Code_with_Harry;
 import java.io.*;
public class buffer {
    public static void main(String[] args) {
                String filePath = "file.txt"; 
                long startTime = System.currentTimeMillis(); 
                int ch;
                try  {  
                FileInputStream fin= new FileInputStream(filePath); 
                BufferedInputStream  bin=new BufferedInputStream(fin);
                while((ch=bin.read())!=-1) {}  
                } 
                catch (IOException e) 
                {
                    System.out.println(e);
                }
                
                long endTime = System.currentTimeMillis();  
                long duration = endTime - startTime;  
                System.out.println("Time taken with buffering: " + duration + " milliseconds");
            
        
    }

}
