package com.fiap.exercicios;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroDias = 24; // Medir a temperatura ao longo de 24 dias
        double[] temperaturas = new double[numeroDias];
        
        for (int dia = 0; dia < numeroDias; dia++) {
            System.out.print("Digite a temperatura do dia " + (dia + 1) + ": ");
            temperaturas[dia] = scanner.nextDouble();
        }
        
        scanner.close();
        
        double maiorTemperatura = temperaturas[0];
        double menorTemperatura = temperaturas[0];
        
        double somaTemperaturas = 0.0;
        
        for (int dia = 0; dia < numeroDias; dia++) {
            double temperaturaAtual = temperaturas[dia];
            
            if (temperaturaAtual > maiorTemperatura) {
                maiorTemperatura = temperaturaAtual;
            }
            
            if (temperaturaAtual < menorTemperatura) {
                menorTemperatura = temperaturaAtual;
            }
            
            somaTemperaturas += temperaturaAtual;
        }
        
        double temperaturaMedia = somaTemperaturas / numeroDias;
        
        System.out.println("Maior temperatura registrada nos " + numeroDias + " dias: " + maiorTemperatura + " graus Celsius");
        System.out.println("Menor temperatura registrada nos " + numeroDias + " dias: " + menorTemperatura + " graus Celsius");
        System.out.println("Temperatura média dos " + numeroDias + " dias: " + temperaturaMedia + " graus Celsius");
    }
}
