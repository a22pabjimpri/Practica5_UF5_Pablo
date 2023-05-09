/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercici1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author ausias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] valors = new int[1000];
        for (int i = 0; i < 1000; i++) {
            valors[i] = random.nextInt(100); 
        }
        
        Map<Integer, Comptador> frequencies = new HashMap<>();

        for (int valor : valors) {
            if (!frequencies.containsKey(valor)){
                frequencies.put(valor, new Comptador());
            }
            frequencies.get(valor).incrementarFrequencia();
        }

        for (Map.Entry<Integer, Comptador> entry : frequencies.entrySet()) {
            int num = entry.getKey();
            Comptador comptador = entry.getValue();
            System.out.println("Numero: " + num + ", Frecuencia: " + comptador.getFrequencia());
        }
        
    }
}


