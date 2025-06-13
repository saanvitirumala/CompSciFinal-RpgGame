package entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import main.GamePanel;
import main.KeyHandler;

/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: Player.java
    Date: Jun 11, 2025
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/
public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;
    
    public final int screenX;
    public final int screenY;
    int hasKey = 0;
    boolean hasSword = false;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;
        
        screenX = (gp.screenWidth/2) - (gp.tileSize/2);
        screenY = (gp.screenHeight/2) - (gp.tileSize/2);
        
        solidArea = new Rectangle();
        solidArea.x = 12;
        solidArea.y = 12;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 24;
        solidArea.height = 24;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {

        worldX = gp.tileSize * 23;
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "front";

    }

    public void getPlayerImage() {
        try {

            // When we have more advanced sprites (have double direction sprites)
//            up1 = ImageIO.read(getClass().getResourceAsStream("/player/up1.png"));
//            up2 = ImageIO.read(getClass().getResourceAsStream("/player/up2.png"));
//            down1 = ImageIO.read(getClass().getResourceAsStream("/player/down1.png"));
//            down2 = ImageIO.read(getClass().getResourceAsStream("/player/down2.png"));
//            left1 = ImageIO.read(getClass().getResourceAsStream("/player/left1.png"));
//            left2 = ImageIO.read(getClass().getResourceAsStream("/player/left2.png"));
//            right1 = ImageIO.read(getClass().getResourceAsStream("/player/right1.png"));
//            right2 = ImageIO.read(getClass().getResourceAsStream("/player/right2.png"));
            front = ImageIO.read(getClass().getResourceAsStream("/player/front.png"));
            up = ImageIO.read(getClass().getResourceAsStream("/player/up.png"));
            down = ImageIO.read(getClass().getResourceAsStream("/player/down.png"));
            left = ImageIO.read(getClass().getResourceAsStream("/player/left.png"));
            right = ImageIO.read(getClass().getResourceAsStream("/player/right.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {

        if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed) {
            
            if (keyH.upPressed) {
                direction = "up";
            } else if (keyH.downPressed) {
                direction = "down";
            } else if (keyH.leftPressed) {
                direction = "left";
            } else if (keyH.rightPressed) {
                direction = "right";
            }
            
            // CHECK TILE COLLISION
            collisionOn = false;
            gp.cChecker.checkTile(this);
            
            // CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);
            
            // IF COLLISION IS FALSE, PLAYER CAN MOVE
            if (!collisionOn) {
                
                switch (direction) {
                    case "up":
                        worldY -= speed;
                        break;
                    case "down":
                        worldY += speed;
                        break;
                    case "left":
                        worldX -= speed;
                        break;
                    case "right":
                        worldX += speed;
                        break;
                }
                
            }

            spriteCounter++;
            if (spriteCounter > 12) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
            
        }

    }
    
    public void pickUpObject(int i) {
        
        if (i != 999) {
            
            String objectName = gp.obj[i].name;
            
            switch (objectName) {
                case "Key":
                    hasKey++;
                    gp.obj[i] = null;
                    System.out.println("Key: " + hasKey);
                    break;
                case "Door":
                    if (hasKey > 0) {
                        gp.obj[i] = null;
                        hasKey--;
                    }
                    System.out.println("Key: " + hasKey);
                    break;
                case "Sword":
                    hasSword = true;
                    gp.obj[i] = null;
                    System.out.println("Has Sword");
                    break;
                case "Monster1":
                    if(hasSword){
                        gp.obj[i] = null;
                        
                    }
                    break;
            }
            
        }
        
    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;

        // Need to Update when have new sprite models <3
        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up;
                }
                if (spriteNum == 2) {
                    image = front;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down;
                }
                if (spriteNum == 2) {
                    image = front;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left;
                }
                if (spriteNum == 2) {
                    image = front;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right;
                }
                if (spriteNum == 2) {
                    image = front;
                }
                break;
            default:
                image = front;
                break;
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

    }

}
