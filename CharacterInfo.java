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
    private static int transpo;
    private static String transpoName;
    private static double cash = 500.00;
    private static int beer = 0;
    private static int gas = 0;
    private static int food = 0;
    private static int parts = 0;
    private static final double beerPrice = 2.00;
    private static final double gasPrice = 2.00;
    private static final double foodPrice = 5.00;
    private static final double partsPrice = 4.00;
    
    
    
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
    public static void setTranspo(int input) {
        if(input == 1){
            transpo = 1;
            transpoName = "Bio Diesel Conversion";
            System.out.println("Setting transportation to: " + transpoName);      
        }
        else if(input == 2) {
            transpo = 2;
            transpoName = "Fixie";
            System.out.println("Setting transportation to: " + transpoName);
        }
        else if(input == 3) {
            transpo = 3;
            transpoName = "Hitchhike";
            System.out.println("Setting transportation to: " + transpoName);
        }
    }
    public static double adjustCash(double input) {
        cash += input;
        return cash;
    }
    public static int adjustBeer(int input) {
        beer += input;
        return beer;
    }
    public static int adjustGas(int input) {
        gas += input;
        return gas;
    }
    public static int adjustFood(int input) {
        food += input;
        return food;
    }
    public static int adjustParts(int input) {
        parts += input;
        return parts;
    }
    public String getName() {
        return name;
    }
    public int getProfession() {
        return profession;
    }
    public String getProfessionName() {
        return professionName;
    }
    public int getTranspo() {
        return transpo;
    }
    public String getTranspoName() {
        return transpoName;
    }
    public double getCash() {
        return cash;
    }
    public int getBeer() {
        return beer;
    }
    public int getFood() {
        return food;
    }
    public int getParts() {
        return parts;
    }
    public int getGas() {
        return gas;
    }
    public double getBeerPrice() {
        return beerPrice;
    }
    public double getGasPrice() {
        return gasPrice;
    }
    public double getFoodPrice() {
        return foodPrice;
    }
    public double getPartsPrice() {
        return partsPrice;
    }
}

