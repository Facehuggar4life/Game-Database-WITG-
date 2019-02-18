/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebase;

import java.util.Scanner;

/**
 *
 * @author Owen
 */
public class InputAndConversion {
    String genre;
    int date;
    String plat;
    public void Input() {
        System.out.println("Please enter the genre of the game in question.");
        Scanner genreScan = new Scanner(System.in);
        genre = genreScan.nextLine().toLowerCase();
        System.out.println("Please enter the release date of the game in question. Failure to enter in integers will result in a runtime error.");
        Scanner dateScan = new Scanner(System.in);
        date = dateScan.nextInt();
        System.out.println("Please enter a platform of the game in question.");
        Scanner platformScan = new Scanner(System.in);
        plat = platformScan.nextLine().toLowerCase();
        System.out.println("You entered" + " " + genre + ", " + date + ", " + plat );

    }
    public void endOfProgram(){
           GameBase DB = new GameBase();
           System.out.println("Please indicate as to if you would like to close the program or run it again.");
           Scanner endScan = new Scanner(System.in);
           String In = endScan.nextLine();
           switch(In.toLowerCase()){
               case "end":
                   System.exit(0);
                   break;
                case "restart":
                    String args[] = {""};
                    DB.main(args);
                    break;
           }
    }
}
