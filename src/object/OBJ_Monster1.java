package object;

import java.io.IOException;
import javax.imageio.ImageIO;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: OBJ_Monster1.java
    Date: Jun 13, 2025
 Purpose: 
  Author: Saanvi Tirumala

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

public class OBJ_Monster1 extends SuperObject{

    public OBJ_Monster1 () {
        
        name = "Monster1";
        try {
            
            image = ImageIO.read(getClass().getResourceAsStream("/objects/lvl1left.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        solidArea.x = 5;
        
    }

}
