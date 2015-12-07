/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

/**
 *
 * @author hayden
 */
public class CharacterInfo {
    private static String name;
    private static int profession;
    private static String professionName;
    
    public static void setName(String input) {
        name = input;
        System.out.println("Setting name to: " + name);
    }
    public static void setProfession(int input) {
        if(input == 1){
            profession = 1;
            professionName = "Starbucks barista";
            System.out.println("Setting profession to: " + professionName);
        }
        else if(input == 2) {
            profession = 2;
            professionName = "Craft brewer";
            System.out.println("Setting profession to: " + professionName);
        }
        else if(input == 3) {
            profession = 3;
            professionName = "Bike mechanic";
            System.out.println("Setting profession to: " + professionName);
        }
        else if(input == 4) {
            profession = 4;
            professionName = "Tattoo artist";
            System.out.println("Setting profession to: " + professionName);
        }
    }
    public String getName() {
        return name;
    }
    public int getProfession() {
        return profession;
    }
}

