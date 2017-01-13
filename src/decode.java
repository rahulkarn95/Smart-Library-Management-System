
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import com.google.zxing.Reader;
import com.google.zxing.Result;
 

import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;

/**
 *
 * @author Rahul
 */
public class decode{  
    public static void main(String []args)
    {
        try{
        FileInputStream barCodeInputStream = new FileInputStream("C:\\Users\\RAHUL\\Desktop\\1.png");
        BufferedImage barCodeBufferedImage = ImageIO.read(barCodeInputStream);
        LuminanceSource source = new BufferedImageLuminanceSource(barCodeBufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Reader reader = new MultiFormatReader();
        Result result = reader.decode(bitmap);
        System.out.println("Barcode text is " + result.getText());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
