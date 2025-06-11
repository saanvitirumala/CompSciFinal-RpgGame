package main;

import java.awt.*;
import javax.swing.*;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: GamePanel.java
    Date: Jun 11, 2025
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

public class GamePanel extends JPanel{
        
        // SCREEN SETTINGS
        final int originalTileSize = 16; //16x16 tile
        final int scale = 3;
        
        final int tileSize = originalTileSize * scale; // 48x48 tile
        final int maxScreenCol = 16; // 4:3 ratio
        final int maxScreenRow = 12;
        final int screenWidth = tileSize * maxScreenCol; // 768 pixels
        final int screenHeight = tileSize * maxScreenRow; // 576 pixels
        
        
        public GamePanel() {
            
            this.setPreferredSize(new Dimension (screenWidth, screenHeight));
            this.setBackground(Color.black);
            this.setDoubleBuffered(true);
        }

}
