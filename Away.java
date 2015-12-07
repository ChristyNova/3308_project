/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hayden
 */
public class Away extends JPanel{
    BufferedImage image;
    
    
    public Away(){
	try {
	String path = "bklnBridge.png";
	File file = new File(path);
	
	image = ImageIO.read(file);
	} catch (IOException e){
		
	}
	
	if(image == null)
	{
		System.out.println("Image not found");
	}
	}
    
    
	public void paintComponent(Graphics g){
            int a = 300;
            int b = 200;
                CharacterInfo charInfo = new CharacterInfo();
                double cash = charInfo.getCash();
                int beer = charInfo.getBeer();
                int food = charInfo.getFood();
                int parts = charInfo.getParts();
                String menu[] = {"And you\'re on your way!", "","Oh No! Forgot something?", "Type \'1\' to return to the store", "", "Future Levels coming soon", "", "Type \'quit\' or just click \'ok\' to return to the main menu"};
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
                g.drawImage(image, 0, 0, null);
                g.clearRect(a-20, b-50, 350, 275);
		for(int i = 0;i < 9;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
                }
                
                
        }
}
