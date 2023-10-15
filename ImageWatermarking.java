import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageWatermarking {

    public static void main(String[] args) {
        try {
            // Load the original image
            BufferedImage originalImage = ImageIO.read(new File("E:\\java workspace"));

            // Create a copy of the original image for watermarking
            BufferedImage watermarkedImage = new BufferedImage(
                    originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) watermarkedImage.getGraphics();
            g2d.drawImage(originalImage, 0, 0, null);

            // Define the watermark text and font
            String watermarkText = "Watermark";
            Font watermarkFont = new Font("Arial", Font.BOLD, 36);

            // Set the watermark color
            g2d.setColor(Color.RED);

            // Apply the watermark to the image
            g2d.setFont(watermarkFont);
            g2d.drawString(watermarkText, 20, 40);
            g2d.dispose();

            // Save the watermarked image
            ImageIO.write(watermarkedImage, "jpg", new File("path/to/watermarked/image.jpg"));

            System.out.println("Watermark applied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
