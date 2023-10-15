package io.github.jiangdequan;
  import java.io.*;
public class 2.java {
    
    


    public static void main(String[] args) {
        String fileName = "sample.txt"; // Replace with your file name

        // Read data in byte format
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int data;
            System.out.println("Reading data in byte format:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data); // Convert byte to char and print
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n---------------------------------------");

        // Read data in character format
        try {
            FileReader fr = new FileReader(fileName);
            int data;
            System.out.println("Reading data in character format:");
            while ((data = fr.read()) != -1) {
                System.out.print((char) data); // Directly print as char
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
