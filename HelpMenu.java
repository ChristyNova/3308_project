/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class HelpMenu extends JPanel{
    
    BufferedImage image;
	public HelpMenu(){
	try {
	String path = "mustache.png";
	File file = new File(path);
	
	image = ImageIO.read(file);
	} catch (IOException e){
		
	}
	
	if(image == null)
	{
		System.out.println("Image not found");
	}
	}
	
	String menu[] = {"HELP","In this game,the computer will","give you a few options for actions","on every turn. Simply type the", "action that corresponds","to the action and press enter","Good luck and happy trails!"};
	int a = 100;
	int b = 100;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.drawLine(50, 50, 500, 50);
		g.drawLine(50, 50, 50, 500);
		g.drawLine(50,500,500,500);
		g.drawLine(500, 500, 500, 50);
		for(int i = 0;i < 7;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
		}
                g.drawImage(image, 225, 0, 50, 50, null);
                b=200;
		//repaint();
		//input = JOptionPane.showInputDialog("");
		//if(input == "1"){
			//g.drawString(NameCharacter, 50, 50);
		//}
	}
}