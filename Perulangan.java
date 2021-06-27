/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author User
 */
public class Perulangan {
    public static void main(String[] args) {
        int[][] matriks = new int [4][4];
        matriks[0][0]=1;
        matriks[0][1]=2;
        matriks[0][2]=3;
        matriks[0][3]=4;
        matriks[1][0]=5;
        matriks[1][1]=6;
        matriks[1][2]=7;
        matriks[1][3]=8;
        for(int i=0;i < 2;i++){
            for(int j=0;j < matriks[0].length;j++){
                
            
                System.out.print(matriks[i][j]);
            }
        
        System.out.println();}

    }
    
}
