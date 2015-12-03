/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package adventuretrail;

import java.util.Scanner;

/**
 *
 * @author hayden
 */
public class AdventureTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System objects
        Scanner in = new Scanner(System.in);
        String charName;
        
        //variables
        boolean running = true;
        
        System.out.println("===========================================\n"
                          +"---             Welcome to              ---\n"
                          +"---           Adventure Trail           ---\n"
                          +"---                                     ---\n"
                          +"---                                     ---\n"
                          +"---                                     ---\n"
                          +"---                                     ---\n"
                          +"---       Press enter to continue       ---\n"
                          +"---                                     ---\n"
                          +"---                                     ---\n"
                          +"===========================================");
        in.nextLine();
        
        MENU:
        while(running) {
            System.out.println("===========================================\n"
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
                                  +"===========================================");
                running = false;
            }
        }
    }
    
}
