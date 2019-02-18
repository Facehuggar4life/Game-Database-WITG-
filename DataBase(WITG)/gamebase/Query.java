/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebase;

import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class Query {
    
    private final Data _data;
    private final InputAndConversion _INA;

    Query(Data data, InputAndConversion INA) {
        this._data = data;
        this._INA = INA;
    }
    private int results = 0;
    //results is added to everytime a game matching the user's entries is found.
    //results can be checked for equality to O. If there are 0 results the program suggests the user enter different search terms 
    public void Query() {
        HashMap<Integer, GameRecord> GNAMirror = this._data.getGNA();
        //This is a Mirror of the Hashmap is the Data class. The mirror improves clarity when referncing the Hashmap
        for (Integer i = 0; i <= 84; i++) {
            String DatabaseName = (GNAMirror.get(i)).Name;
            String DatabasePlatform = (GNAMirror.get(i)).Platform;
            String DatabaseGenre = (GNAMirror.get(i)).Genre;
            int DatabaseYear = (GNAMirror.get(i)).Year;
            if (DatabasePlatform.equals(this._INA.plat) && DatabaseGenre.equals(this._INA.genre) && DatabaseYear == this._INA.date) {
                System.out.println("Your game could be: " + DatabaseName);
                results++;
            }
        }
        if(results <= 0){
                System.out.println("There are no games matching the entered parameters. Reevaluate your search terms to confirm they are valid or try a different query.");
        }
        //Calls endOfProgram method which asks the user whether they would like to exit the program or make another query.
        InputAndConversion INA = new InputAndConversion();
        INA.endOfProgram();
    }
}
