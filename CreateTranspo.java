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
public class CreateTranspo extends JPanel {
    BufferedImage image;
    public CreateTranspo(){
        try {
            String path = "mustache.png";
            File file = new File(path);
	
            image = ImageIO.read(file);
        } catch (IOException e){}
	
        if(image == null)
        {
            System.out.println("Image not found");
        }
    }
    
    //String name;
    CharacterInfo charInfo = new CharacterInfo();
    String charName;
    String charProf;
    
    int a = 100;
    int b = 100;
    
    public void paintComponent(Graphics g){
        charName = charInfo.getName();
        charProf = charInfo.getProfessionName();
        System.out.println("Stored name is" + charName);
        String character[] = { "Ok, " + charName + " the " + charProf + ", you're almost ready to head out West!", "", "It's a long trip though, how do you want to get there?", "", "1. Bio Diesel conversion", "2. Fixie", "3. Hitchhike"};
        super.paintComponent(g);
	this.setBackground(Color.WHITE);
	g.setColor(Color.BLACK);
	g.drawLine(50, 50, 500, 50);
	g.drawLine(50, 50, 50, 500);
	g.drawLine(50,500,500,500);
	g.drawLine(500, 500, 500, 50);
	for(int i = 0;i < 7;i++){
            g.drawString(character[i],a , b);
            b = b + 20;
	}
        g.drawImage(image, 225, 0, 50, 50, null);
    }
}      

