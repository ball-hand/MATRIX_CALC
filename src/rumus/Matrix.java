/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumus;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class Matrix {
    public int [][] A;
    public int [][] B;
    public int [][] C;
    
    Scanner scanner = new Scanner(System.in);
    public void showingForm(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Masukan Nilai matrix indeks ke ["+(i+1)+"]["+(j+1)+"]:");
                A[i][j] = scanner.nextInt();
            }
        }
}
    
    


}
