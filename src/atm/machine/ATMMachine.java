/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.machine;
import java.io.IOException;

/**
 *
 * @author codefeak
 */
public class ATMMachine extends OptionMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        OptionMenu optionMenu = new OptionMenu();
        
        optionMenu.getLogin();
    }
    
}
