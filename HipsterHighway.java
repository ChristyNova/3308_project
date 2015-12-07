/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import javax.swing.*;


/* In order to use jPanel and painting:
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
*/

/**
 *
 * @author hayden, David, Christy 
 */
public class HipsterHighway extends JPanel{
//USING JPANEL and painting:

	/*public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		// This method is inherited from Component.
   		// We over-write this method so we can
   		// define our own graphics that we wish to paint on the the panel.
		g.setColor(Color.BLACK);
		g.drawLine(50, 50, 500, 50);
		g.drawLine(50, 50, 50, 500);
		g.drawLine(50,500,500,500);
		g.drawLine(500, 500, 500, 50);
		//g.drawString(HomeScreen, 50, 50);
		//input = JOptionPane.showInputDialog("");
		//if(input == "1"){
			//g.drawString(NameCharacter, 50, 50);


		Font f = g.getFont();			// retrieve current font
		g.setFont(new Font("Serif", Font.ITALICS, 12)); 

		//}
	}*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System objects
        //Scanner in = new Scanner(System.in);
        //String charName;
    	//String input;
    	JFrame f = new JFrame("HipsterHighway");
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //CharacterInfo charInfo = new CharacterInfo();
        MainMenu m = new MainMenu();
        HelpMenu h = new HelpMenu();
        CreateCharacter c = new CreateCharacter();
        WelcomeName w = new WelcomeName();
        while(true) {
            f.add(m);
            f.setSize(550,550);
            f.setVisible(true);
            String input;
                input = JOptionPane.showInputDialog("");
            System.out.println(input);
            switch (input) {
                case "1":
                    f.add(c);
                    f.setVisible(true);
                    String name;
                    name = JOptionPane.showInputDialog("");
                    CharacterInfo.setName(name);
                    System.out.println(name);
                    f.setVisible(false);
                    f.add(w);
                    f.setVisible(true);
                    f.remove(c);
                    int profession;
                        profession = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number for your profession:"));
                    CharacterInfo.setProfession(profession);
                    f.remove(w);
                    f.setVisible(false);
                    break;
                case "2":
                    System.out.println("Coming soon");
                    break;
                case "3":
                    System.out.println("Coming soon");
                    break;
                case "4":
                    f.add(h);
                    f.setVisible(true);
                    
                    //int cont = 1;
                    
                        JOptionPane.showMessageDialog(null, "Click to continue");
                    
                    f.remove(h);
                    f.setVisible(false);
                    break;
                }
            }
        }
        //MENU:
        //while(running) {
            /*System.out.println("===========================================\n"
                              +"---             Welcome to              ---\n"
                              +"---           Adventure Trail           ---\n"
                              +"---                                     ---\n"
                              +"---      1. Create Character            ---\n"
                              +"---      2. New Game                    ---\n"
                              +"---      3. Load Game                   ---\n"
                              +"---      4. Help                        ---\n"
                              +"---      5. Quit                        ---\n"
                              +"---                                     ---\n"
                              +"===========================================");
            
            String input = in.nextLine();
            if(input.equals("1")) {
                System.out.println("===========================================\n"
                                  +"---             Welcome to              ---\n"
                                  +"---           Adventure Trail           ---\n"
                                  +"---                                     ---\n"
                                  +"---  Please enter your character's      ---\n"
                                  +"---  name:                              ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"===========================================");
                charName = in.nextLine();
                System.out.println("===========================================\n"
                                  +"---             Welcome to              ---\n"
                                  +"---           Adventure Trail           ---\n"
                                  +"---                                     ---\n"
                                  +"---         That's a great name!        ---\n"
                                  +"---     See you on the trail " + charName +"!    ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"===========================================");
            }
            if(input.equals("2")) {
                System.out.println("New game coming soon!");
            }
            if(input.equals("3")) {
                System.out.println("Load game coming soon!");
            }
            if(input.equals("4")) {
                System.out.println("===========================================\n"
                                  +"---                 HELP                ---\n"
                                  +"--- In this game, the computer will     ---\n"
                                  +"--- give you a few options for actions  ---\n"
                                  +"--- on every turn. Simply type the      ---\n"
                                  +"--- instruction that corresponds to the ---\n"
                                  +"--- action and press enter.             ---\n"
                                  +"---     Good Luck and Happy Trails!     ---\n"
                                  +"---                                     ---\n"
                                  +"---       Press enter to continue       ---\n"
                                  +"===========================================");
                in.nextLine();
            }
            if(input.equals("5")) {
                System.out.println("===========================================\n"
                                  +"---           Goodbye From              ---\n"
                                  +"---          Adventure Trail            ---\n"
                                  +"---                                     ---\n"
                                  +"--- Thanks for playing Adventure Trail! ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"---    Hayden, Christy, and David       ---\n"
                                  +"---                                     ---\n"
                                  +"---                                     ---\n"
                                  +"===========================================")*/
                //running = false;
            //}
        //}  
    }


