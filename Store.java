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
public class Store extends JPanel{
    BufferedImage image;
    
    
    public Store(){
	try {
	String path = "bodega.png";
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
                String menu[] = {"You currently have: " + cash + " dollars.", "", "Make a selection from the menu in order to purchase:", "1. PBR ($2.00/beer)", "2. Food (5.00/lb)", "3. Bike Parts ($4.00/part)", "4. Gas ($2.00/gallon)", "", "Type \'done\' when you\'re finished shopping"};
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
                g.drawImage(image, 0, 0, null);
                g.clearRect(a-20, b-50, 350, 250);
		for(int i = 0;i < 9;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
                }
                
                
        }
}
