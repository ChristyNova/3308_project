/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hayden
 */
public class RunGame {
    public void RunGame(){
        CharacterInfo charInfo = new CharacterInfo();
        String name = charInfo.getName();
        int profession = charInfo.getProfession();
        String professionName = charInfo.getProfessionName();
        int transpo = charInfo.getTranspo();
        String transpoName = charInfo.getTranspoName();
        String first = "Welcome to the Hipster Highway, " + name + "!\nYou\'re about to embark on an exciting journey from one coast to the other.\n\nJust like your ancestors who traveled the long trail to Oregon in search of a better life,\n you too can see that the beer is hoppier, the mustaches bushier, and the sweaters more ironic\nin the promised land of Portland, Oregon.";
        String second = "As a bonus, the ultimate in music festivals is taking place in only four weeks,\nright in your new home town!\nEven though festivals have become so overblown and mainstream now that most are actively nauseating,\nthis one is different.\nTweed Vest Fest 2015 has a headlining list of bands even you've never heard of, so it must be amazing.";
        String third = null;
        if(transpo == 1) {
            third = "Long story short, you've only got 4 weeks to make it over two thousand miles.\nSo you load up your vintage Benz, running on recycled cooking oil from the sustainable\nChinese food restaurant down the block, of course,\n and strike out in search of your manifest destiny!";
        }
        else if(transpo == 2) {
            third = "Only 4 weeks to travel over two thousand miles and all you've got is a fixed gear bicycle!\n\nLuckily years of living in ironic dettachment from the real world lets you\nobserve your impending failure with the cool, condescending snark you usually\nreserve for listening to people discussing fantasy football.";
        }
        else if(transpo == 3) {
            third = "Now if only you had ever parlayed some of your skills as a " + professionName + " intoreliable transportation.\n  That's alright though, hitchhiking is a totally romantic way to channel your hero, Jack Kerouac.\n  The beat generation did this type of stuff all the time, after all.\n  Maybe when you finally get there, you'll take the experience and write\nthe next great American road story.";
        }
        String fourth = "No matter how you're getting there though, the first stop is right\naround the corner at your local bodega.\n\nTime to buy all the supplies you'll need\nfor the coming month of hardships.";
        JFrame f = new JFrame("HipsterHighway");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Map m = new Map();
         boolean running = true;
        f.add(m);
        f.setSize(550,550);
        f.setVisible(true);
        while(running) {
            f.add(m);
            f.setSize(1356,759);
            f.setVisible(true);
            JOptionPane.showMessageDialog(null, first);
            JOptionPane.showMessageDialog(null, second);
            JOptionPane.showMessageDialog(null, third);
            JOptionPane.showMessageDialog(null, fourth);
            String input;
                input = JOptionPane.showInputDialog("");
            System.out.println(input);
            switch(input) {
                case "quit":
                    running = false;
                    f.dispose();
                    break;
            }
        }
    }
    
}
