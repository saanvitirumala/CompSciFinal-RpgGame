package object;

import java.io.IOException;
import javax.imageio.ImageIO;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: OBJ_Chest1.java
    Date: Jun 12, 2025
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

public class OBJ_OpenChest extends SuperObject{

    public OBJ_OpenChest() {
        name = "OpenChest";
        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/objects/chest_opened.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
