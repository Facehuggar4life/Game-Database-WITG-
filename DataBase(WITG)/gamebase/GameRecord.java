/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebase;

/**
 *
 * @author Owen
 */
public class GameRecord {
    public String Name;
    public String Genre;
    public int Year;
    public String Platform;
    public GameRecord(String Name, String Genre, String Platform, int Year){
        this.Name = Name;
        this.Genre = Genre;
        this.Platform = Platform;
        this.Year = Year;
    }

}
