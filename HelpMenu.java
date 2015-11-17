import java.util.Scanner;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.*;

public class HelpMenu extends JPanel{
	
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
		for(int i = 0;i < 6;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
		}
		//input = JOptionPane.showInputDialog("");
		//if(input == "1"){
			//g.drawString(NameCharacter, 50, 50);
		//}
	}
}