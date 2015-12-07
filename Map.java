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

/**
 *
 * @author hayden
 */
public class Map extends JPanel{
    BufferedImage image;
    
    public Map(){
	try {
	String path = "hipsterMap.png";
	File file = new File(path);
	
	image = ImageIO.read(file);
	} catch (IOException e){
		
	}
	
	if(image == null)
	{
		System.out.println("Image not found");
	}
	}
    
    int a = 100;
	int b = 100;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		/*
		for(int i = 0;i < 6;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
                }
                        */
                g.drawImage(image, 0, 0, 1356, 759, null);
        }
}
