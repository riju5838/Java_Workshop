package io.github.jiangdequan;
import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;
    
public class Q890 {

    
    public static void main(String[] args) {
            String filename = "example.txt";
    
            try {
                // Create a FileWriter with the specified filename
                FileWriter fileWriter = new FileWriter(filename);
    
                // Create a BufferedWriter to efficiently write characters to the file
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    
                // Write data to the file
                bufferedWriter.write("Hello, this is an example of input and output streams.\n");
                bufferedWriter.write("This is the second line of the file.");
    
                // Close the BufferedWriter
                bufferedWriter.close();
    
                System.out.println("Data written to " + filename + " successfully!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }