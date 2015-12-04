/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import java.awt.*;
import javax.swing.*;

public class CreateCharacter extends JPanel{
	
	String menu[] = {"Welcome to Hipster Highway","","","Please Enter your Character's name:","",""};
	String input = "Name";
        String Character[] = { "That's a great name!", "See you on the trail " + input};
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
		for(int i = 0;i < 6;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
                }
	}
}