/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author hayden
 */
public class WelcomeName extends JPanel {
    //String name;
    CharacterInfo charInfo = new CharacterInfo();
    String charName;
    
    
    int a = 100;
    int b = 100;
    
    public void paintComponent(Graphics g){
        charName = charInfo.getName();
        System.out.println("Stored name is" + charName);
        String character[] = { "That's a great name, " + charName + "!", "What did you do before you hit the road?", "Were you a:", "1. Starbucks Barista", "2. Craft Brewer", "3. Bike Mechanic", "4. Tattoo Artist"};
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
    }
}        
