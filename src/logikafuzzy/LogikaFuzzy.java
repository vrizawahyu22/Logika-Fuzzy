package logikafuzzy;

import java.util.Scanner;

public class LogikaFuzzy {

    /**
     * @param args the command line arguments
     */
    static double[][] R, S;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        R = buatMatriks(4, 4, 1, 0.3, 0.1, 0, 0.2, 1, 0.3, 0.1, 0, 0.7, 1, 0.2, 0, 0.1, 0.4, 1);
        S = buatMatriks(4, 2, 1, 0.4, 0.5, 1, 0.3, 0.1, 0, 0);
        System.out.println("Matrix R");
        cetak(R);
        System.out.println("");
        System.out.println("Matrix S");
        cetak(S);
        System.out.println("");

        R = transpose(R);
        System.out.println("Matrik R Transpose");
        cetak(R);
        
        System.out.println("");
        System.out.println("Matrik Max Min Composition");
        double[][] maxmin = maxminComposition(R, S);
        cetak(maxmin);
        System.out.println("");
        
        System.out.println("Matrix Max Product Composition");
        double[][] maxproduct = maxproductCompostition(R, S);
        cetak(maxproduct);
    }

    public static double[][] buatMatriks(int nBaris, int nKolom, double... data) {
        double[][] result = new double[nBaris][nKolom];
        int count = 0;
        for (int baris = 0; baris < nBaris; baris++) {
            for (int kolom = 0; kolom < nKolom; kolom++) {
                result[baris][kolom] = data[count++];
            }
        }
        return result;
    }

    public static double[][] transpose(double[][] matriksA) {
        double[][] result = new double[matriksA[0].length][matriksA.length];
        for (int baris = 0; baris < matriksA.length; baris++) {
            for (int kolom = 0; kolom < matriksA[0].length; kolom++) {
                result[baris][kolom] = matriksA[kolom][baris];
            }
        }
        return result;
    }

    public static double[][] maxminComposition(double[][] R, double[][] S) {
        double result[][] = new double[R.length][S[0].length];
        for (int baris = 0; baris < R.length; baris++) {
            for (int kolom = 0; kolom < S[0].length; kolom++) {
                for (int ordo = 0; ordo < S.length; ordo++) {
                    result[baris][kolom] = cariMax(result[baris][kolom], cariMin(R[baris][ordo], S[ordo][kolom]));
                }
            }
        }
        return result;
    }

    public static double[][] maxproductCompostition(double[][] R, double[][] S) {
        double result[][] = new double[R.length][S[0].length];
        for (int baris = 0; baris < R.length; baris++) {
            for (int kolom = 0; kolom < S[0].length; kolom++) {
                for (int ordo = 0; ordo < S.length; ordo++) {
                    result[baris][kolom] = cariMax(result[baris][kolom], R[baris][ordo] * S[ordo][kolom]);
                }
            }
        }
        return result;
    }

    public static void cetak(double[][] matriks) {
        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[0].length; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println("");
        }
    }

    public static double cariMin(double a, double b) {
        return a < b ? a : b;
    }

    public static double cariMax(double a, double b) {
        return a > b ? a : b;
    }
}
