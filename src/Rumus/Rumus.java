/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rumus;

import javax.swing.JOptionPane;

/**
 *
 * @author zero
 */
public class Rumus {
        
        public double determinan(double a11,double a12, double a13, double a21, double a22, double a23, double a31,double a32, double a33){
        double result = ((a11 * a22 * a33) + (a12 * a23 * a31) + (a13 * a21 * a32)) - ((a13 * a22 * a31) + (a11 * a23 * a32) + (a12 * a21 * a33));
        return result;
        }
        public double determinan(double a11,double a12,double a21,double a22){
            double result = (a11*a22)-(a12*a21);
            return result;
        }
        
        public double[][] balikan(double a11,double a12,double a21,double a22){
            double Adjoin[][]={
            {a22,(a12-2*a12)},
            {(a21-2*a21),a11}};
            double det = determinan(a11, a12, a21, a22);
            double result[][] = new double[2][2];
            
            if (det == 0) {
                JOptionPane.showMessageDialog(null, "Matriks ini tidak memiliki balikan karena det(a)=0");
            }else{
            
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                     System.out.println(result[i][j]=Adjoin[i][j]/det);
                }
            }return result;
            
            }
            return null;
            
        }public double[][] M2(double a11,double a12,double a21,double a22,double b11,double b12,double b21,double b22,String chose){
                double a[][]= {{a11,a12},{a21,a22}};
                double b[][]= {{b11,b12},{b21,b22}};
                double c[][]= new double[2][2];
                
            if ("Penjumlahan".equals(chose)) {
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j< c.length; j++) {
                    c[i][j] =a[i][j]+b[i][j];
                    }
                }
                return c;
            }else{
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j< c.length; j++) {
                    c[i][j] =a[i][j]-b[i][j];
                    }
                }return c;
            }
        }
        public double [][] M3 (double a11,double a12,double a13,double a21,double a22,double a23,double a31,double a32,double a33,double b11,double b12,double b13,double b21,double b22,double b23,double b31,double b32,double b33,String chose){
                double a[][] = {{a11,a12,a13},{a21,a22,a23},{a31,a32,a33}};
                double b[][] = {{b11,b12,b13},{b21,b22,b23},{b31,b32,b33}};
                
                double c[][] = new double [3][3];
                
            if ("Penjumlahan".equals(chose)) {
                for (int i = 0; i <c.length; i++) {
                    for (int j = 0; j<c.length; j++) {
                         c[i][j] = a[i][j]+b[i][j];
                    }
                }
                return c;
            }else{
                for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j< c.length; j++) {
                    c[i][j] =a[i][j]- b[i][j];
                    }
                }return c;
            }
        }
        public double[] SPL(double x1,double x2,double y1,double y2,double k1,double k2){
              double det = determinan(x1, y2, x2, y1);
              double result[]={((k1* y2) - (y1 * k2)) / det,((x1 * k2) - (x2 * k1)) / det};
              return result;
        }
}
