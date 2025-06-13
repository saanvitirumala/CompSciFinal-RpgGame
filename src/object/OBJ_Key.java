package object;

import java.io.IOException;
import javax.imageio.ImageIO;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: OBJ_Key.java
    Date: Jun 12, 2025
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

public class OBJ_Key extends SuperObject{

    public OBJ_Key () {
        
        name = "Key";
        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        solidArea.x = 5;
        
    }

}
