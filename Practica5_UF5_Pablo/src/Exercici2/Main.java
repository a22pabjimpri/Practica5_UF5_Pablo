/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercici2;
/**
 *
 * @author Pablo Jiménez
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contactes contactes = new Contactes();
        contactes.guardarContacte("Maria", 624087501);
        contactes.guardarContacte("José", 674953903);
        contactes.guardarContacte("Maria Jose", 667080101);
        contactes.guardarContacte("Jose Maria", 679273564);
        contactes.guardarContacte("Pepe", 679273564);
        
        System.out.println("Llistat de contactes");
        contactes.llistarContactes();
        
        
        contactes.cercarContacte("Jose Maria");
        contactes.cercarContacte("Pepe");
        contactes.cercarContacte("Antonio");
        
        
        
        
    }
    
}
