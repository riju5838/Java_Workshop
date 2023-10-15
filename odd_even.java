import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class odd_even {

    public static void main(String[] args) {
        String imagePath = "E:\\"; // Path to your input image
        String watermarkPath = "E:\\"; // Path to your watermark image
        
        BufferedImage originalImage = loadImage(imagePath);
        BufferedImage watermarkImage = loadImage(watermarkPath);

        BufferedImage watermarkedImage = embedWatermark(originalImage, watermarkImage);
        saveImage(watermarkedImage, "watermarked_image.jpg"); // Save the watermarked image
        
        BufferedImage extractedWatermark = extractWatermark(watermarkedImage);
        saveImage(extractedWatermark, "extracted_watermark.png"); // Save the extracted watermark
    }

    private static BufferedImage loadImage(String imagePath) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    private static void saveImage(BufferedImage image, String outputPath) {
        try {
            ImageIO.write(image, "png", new File(outputPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage embedWatermark(BufferedImage originalImage, BufferedImage watermarkImage) {
        BufferedImage watermarkedImage = deepCopy(originalImage);

        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        // Convert images to grayscale
        BufferedImage grayscaleOriginal = convertToGrayscale(originalImage);
        BufferedImage grayscaleWatermark = convertToGrayscale(watermarkImage);

        // Perform FFT on the grayscale images
        double[][] originalFFT = performFFT(grayscaleOriginal);
        double[][] watermarkFFT = performFFT(grayscaleWatermark);

        // Embed the watermark in the frequency domain
        double alpha = 0.1; // Watermark strength (adjust as needed)
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                double real = originalFFT[i][j];
                double imaginary = watermarkFFT[i][j];
                originalFFT[i][j] = real + alpha * imaginary;
            }
        }
      

        // Perform inverse FFT to obtain watermarked image
        BufferedImage watermarkedGrayscale = performInverseFFT(originalFFT);

        // Merge the watermarked grayscale image with the original colored image
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int grayValue = watermarkedGrayscale.getRGB(j, i) & 0xFF;
                int rgb = originalImage.getRGB(j, i);
                int alphaChannel = (rgb >> 24) & 0xFF;
                int newRGB = (alphaChannel << 24) | (grayValue << 16) | (grayValue << 8) | grayValue;
                watermarkedImage.setRGB(j, i, newRGB);
            }
        }

        return watermarkedImage;
    }

    private static BufferedImage extractWatermark(BufferedImage watermarkedImage) {
        int width = watermarkedImage.getWidth();
        int height = watermarkedImage.getHeight();

        BufferedImage grayscaleWatermarked = convertToGrayscale(watermarkedImage);

        // Perform FFT on the grayscale watermarked image
        double[][] watermarkedFFT = performFFT(grayscaleWatermarked);

        // Extract the watermark from the frequency domain
        double[][] watermarkFFT = new double[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                double real = watermarkedFFT[i][j];
                double imaginary = real - watermarkedFFT[i][j];
                watermarkFFT[i][j] = imaginary;
            }
        }

        // Perform inverse FFT to obtain the extracted watermark
        BufferedImage extractedWatermarkGrayscale = performInverseFFT(watermarkFFT);

        // Convert the grayscale extracted watermark to colored image
        BufferedImage extractedWatermarkImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int grayValue = extractedWatermarkGrayscale.getRGB(j, i) & 0xFF;
                int alphaChannel = 255;
                int newRGB = (alphaChannel << 24) | (grayValue << 16) | (grayValue << 8) | grayValue;
                extractedWatermarkImage.setRGB(j, i, newRGB);
            }
        }

        return extractedWatermarkImage;
    }

    private static BufferedImage convertToGrayscale(BufferedImage image) {
        BufferedImage grayscaleImage = new BufferedImage(image.getWidth(), image.getHeight(),
                BufferedImage.TYPE_BYTE_GRAY);
        grayscaleImage.getGraphics().drawImage(image, 0, 0, null);
        return grayscaleImage;
    }

    private static double[][] performFFT(BufferedImage image) {
        // TODO: Implement FFT algorithm
        // You can use libraries like Apache Commons Math or JTransforms to perform the FFT
        // Return the 2D array representing the frequency domain of the image
        return null;
    }

    private static BufferedImage performInverseFFT(double[][] frequencyDomain) {
        // TODO: Implement inverse FFT algorithm
        // You can use libraries like Apache Commons Math or JTransforms to perform the inverse FFT
        // Return the grayscale image obtained from the inverse FFT
        return null;
    }

    private static BufferedImage deepCopy(BufferedImage image) {
        ColorModel colorModel = image.getColorModel();
        boolean isAlphaPremultiplied = colorModel.isAlphaPremultiplied();
        WritableRaster raster = image.copyData(null);
        return new BufferedImage(colorModel, raster, isAlphaPremultiplied, null);
    
}
}