package object;

import java.io.IOException;
import javax.imageio.ImageIO;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: OBJ_Chest1.java
    Date: Jun 12, 2025
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

public class OBJ_Chest1 extends SuperObject{

    public OBJ_Chest1() {
        name = "Chest1";
        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
