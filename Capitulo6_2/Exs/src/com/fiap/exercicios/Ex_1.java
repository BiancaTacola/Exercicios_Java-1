package com.fiap.exercicios;

import java.util.Random;

public class  Ex_1 {
    public static void main(String[] args) {
        // Criar um objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Definir o tamanho do vetor
        int tamanhoVetor = 15;
        
        // Criar um vetor de inteiros com 15 posições
        int[] vetor = new int[tamanhoVetor];
        
        // Preencher o vetor com números inteiros aleatórios
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        }
        
        // Apresentar os elementos do vetor
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
