//Saumojyoti Das
//2141004061
 import java.io.FileWriter;
 import java.io.IOException;
public class Q104 {
    public static void main(String[] args) {

       
        
                String fileName = "example.txt";
                String data = "Hello, this is some sample data that we will write to a file.";
        
                try {
                    FileWriter writer = new FileWriter(fileName);
                    writer.write(data);
                    writer.close();
                    System.out.println("Data written to " + fileName + " successfully.");
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    