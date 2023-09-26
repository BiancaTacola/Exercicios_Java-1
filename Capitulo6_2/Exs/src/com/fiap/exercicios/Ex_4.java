package com.fiap.exercicios;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunos = 20;
        int numeroDisciplinas = 5;

        // Cria uma matriz para armazenar as notas
        double[][] notas = new double[numeroAlunos][numeroDisciplinas];

        // Loop para inserir as notas para cada aluno e disciplina
        for (int aluno = 0; aluno < numeroAlunos; aluno++) {
            System.out.println("Digite as notas do aluno " + (aluno + 1) + ":");
            for (int disciplina = 0; disciplina < numeroDisciplinas; disciplina++) {
                System.out.print("Nota da disciplina " + (disciplina + 1) + ": ");
                notas[aluno][disciplina] = scanner.nextDouble();
            }
        }

        scanner.close();

        // Exibe as notas armazenadas
        System.out.println("Notas armazenadas:");
        for (int aluno = 0; aluno < numeroAlunos; aluno++) {
            System.out.println("Aluno " + (aluno + 1) + ":");
            for (int disciplina = 0; disciplina < numeroDisciplinas; disciplina++) {
                System.out.println("Disciplina " + (disciplina + 1) + ": " + notas[aluno][disciplina]);
            }
        }
    }
}
