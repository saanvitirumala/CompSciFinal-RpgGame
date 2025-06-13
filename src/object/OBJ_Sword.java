package object;

import java.io.IOException;
import javax.imageio.ImageIO;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: OBJ_Sword.java
    Date: Jun 12, 2025
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

public class OBJ_Sword extends SuperObject {

    public OBJ_Sword() {
        name = "Sword";
        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/objects/sword_normal.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
