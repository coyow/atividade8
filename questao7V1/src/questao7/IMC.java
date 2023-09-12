/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class IMC {
    private float alt;
    private float peso;


    
    public float calc(){
        float imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso ");
        this.setPeso(sc.nextFloat());
        System.out.println("\nAgora sua altura");
        this.setAlt(sc.nextFloat());
        
        imc = this.getPeso()/(this.getAlt()*this.getAlt());
        
        if(imc<18.5){
            System.out.println("\nMagreza");
        }else if(imc>18.6&&imc<24.9){
            System.out.println("\nNormal");
        }else if(imc>25&&imc<29.9){
            System.out.println("\nSobrepeso");
        }else if(imc>30&&imc<34.9){
            System.out.println("\nObesidade de grau 1");
        }else if(imc>35&&imc<39.9){
            System.out.println("\nObesidade de grau 2");
        }else if(imc>40){
            System.out.println("\nObesidade de grau 3");
        }
        
        System.out.println("Seu IMC é de " +imc);
        
        return imc;
    }
    
    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
