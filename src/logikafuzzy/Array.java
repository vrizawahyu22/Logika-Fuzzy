/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logikafuzzy;

/**
 *
 * @author vriza wahyu saputra
 */
public class Array {
    int [][] R = new int [4][4];
    int [][] S = new int [2][4];
    
    public void inputR(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p){
        R[0][0] = a;
        R[0][1] = a;
        R[0][2] = a;
        R[0][3] = a;
        R[1][0] = a;
        R[1][1] = a;
        R[1][2] = a;
        R[1][3] = a;
        R[2][0] = a;
        R[2][1] = a;
        R[2][2] = a;
        R[2][3] = a;
        R[3][0] = a;
        R[3][1] = a;
        R[3][2] = a;
        R[3][3] = a;
        
    }
    
    public void inputS(){
        
    }
    
    public static double[][] transposeMatrix(double [][] m){
        double[][] temp = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }
}
