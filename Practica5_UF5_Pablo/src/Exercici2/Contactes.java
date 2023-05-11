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
            String nom = entry.getKey();
            int numTelefon = entry.getValue();
            System.out.println(nom + " - " + numTelefon);

        }
    }

    public void cercarContacte(String nom) {
        Pattern pattern = Pattern.compile(nom.substring(0, 4), Pattern.CASE_INSENSITIVE);
        boolean coincidencia = false;
        for (Map.Entry<String, Integer> entry : agenda.entrySet()) {
            String contacteNom = entry.getKey();
            Matcher matcher = pattern.matcher(contacteNom);
            if (matcher.find()) {
                coincidencia = true;
                System.out.println("Vols dir " + contacteNom + "?");
            }
        }
        if (!coincidencia) {
            System.out.println("No s'ha trobat cap telefon amb el nom: " + nom);
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("Introdueix el nom exacte per mostrar el numero de telèfon: ");
            String nomExacte = scan.nextLine();
            if (agenda.containsKey(nomExacte)) {
                int numeroTelefon = agenda.get(nomExacte);
                System.out.println("El numero de telefon de " + nomExacte + " es: " + numeroTelefon);
            } else {
                System.out.println("No s'ha trobat cap telefon amb el nom: " + nomExacte);
            }
        }

    }

}
