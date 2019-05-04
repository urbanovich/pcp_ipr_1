/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipr_1;

import ipr_1.windows.Table;
import entities.BotanicalGarden;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dzmitry
 */
public class Ipr_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Table table = new Table();
        
        Map<Integer, BotanicalGarden> plants = new HashMap<Integer, BotanicalGarden>();
        table.setEntity(plants);
        
        table.setVisible(true);
    }
    
}
