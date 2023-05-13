/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercici2;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author Pablo Jiménez
 */
public class Contactes {

    private Map<String, Integer> agenda;

    public Contactes() {
        agenda = new HashMap<>();
    }

    public void guardarContacte(String nom, int numTelefon) {
        agenda.put(nom, numTelefon);

    }

    public void llistarContactes() {
        for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
            String nom = entry.getKey();//Recibe la clave que es el nombre, como es un for recibe todos los nombres y luego abajo le da el valor al num
            int numTelefon = entry.getValue();//A través de la clave que le has pasado te devuelve el numero
            System.out.println(nom + " - " + numTelefon);

        }
    }

    public void cercarContacte(String nom) {
        if(agenda.containsKey(nom)){//Si la agenda contiene la key que es el nombre
            System.out.println("El numero de " + nom + " es  " + agenda.get(nom)); //Al mostrarlo hace agenda.get(nom) que devuelve el valor de esa key
        }else{
            System.out.println("El contacto no existe");
        }

    }

}
