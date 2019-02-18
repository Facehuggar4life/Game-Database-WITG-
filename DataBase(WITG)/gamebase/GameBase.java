/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebase;

/**
 *
 * @author owena
 */
public class GameBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputAndConversion I = new InputAndConversion();
        Data D = new Data();
        Query Q = new Query(D, I);
        D.gameEntry();
        I.Input();
        Q.Query();
    }
    
}
