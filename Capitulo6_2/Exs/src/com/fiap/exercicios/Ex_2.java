package com.fiap.exercicios;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Define o número de medições (número de horas)
        int numeroMedicoes = 24; // Por exemplo, para um dia inteiro
        
        // Cria um vetor de doubles para armazenar as temperaturas
        double[] temperaturas = new double[numeroMedicoes];
        
        // Preenche o vetor com as temperaturas
        for (int i = 0; i < numeroMedicoes; i++) {
            System.out.print("Digite a temperatura da hora " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        
        // Fecha o Scanner, pois não será mais usado
        scanner.close();
        
        // Calcula a temperatura média do dia
        double somaTemperaturas = 0.0;
        for (int i = 0; i < numeroMedicoes; i++) {
            somaTemperaturas += temperaturas[i];
        }
        double temperaturaMedia = somaTemperaturas / numeroMedicoes;
        
        // Exibe a temperatura média do dia
        System.out.println("A temperatura média do dia foi: " + temperaturaMedia + " graus Celsius");
    }
}
