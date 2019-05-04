/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author dzmitry
 */
public class BotanicalGarden {
    
    public String title = "";
    
    public String family = "";
    
    public String genus = "";
    
    public String type = "";
    
    public String age = "";
    
    public BotanicalGarden(
            String title, 
            String family, 
            String genus, 
            String type, 
            String age
    ) {
        this.title = title;
        this.family = family;
        this.genus = genus;
        this.type = type;
        this.age = age;
    }
}
