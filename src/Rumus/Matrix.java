/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rumus;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class Matrix {
    int [][]A;
    int [][]B;
    int [][]C;
    
    
    Scanner scanner = new Scanner(System.in);
    public int[][] Matriks1(int a){
        int [][] A = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("Masukan Nilai matrix indeks ke ["+(i+1)+"]["+(j+1)+"]:");
                A[i][j] = scanner.nextInt();
            }
        }return A;
    }
    public int[][] Matriks2(int b){
        int [][] B = new int[b][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Masukan Nilai matrix indeks ke ["+(i+1)+"]["+(j+1)+"]:");
                B[i][j] = scanner.nextInt();
            }
        }return B;
    }
}
