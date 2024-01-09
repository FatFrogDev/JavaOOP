package collections.exercise;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        SuperMarket market = new SuperMarket();
        market.start(scan);
    }
}