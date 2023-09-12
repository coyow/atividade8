/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao7;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso ");
        float peso = sc.nextFloat();
        System.out.println("\nInforme a Altura");
        float alt = sc.nextFloat();
        
        float imc = peso/(alt*alt);
        
        System.out.println("Peso = " +peso+" e sua altura igual a " +alt+"\n Logo possui um IMC equivalente a " +imc);
    }
    
}
