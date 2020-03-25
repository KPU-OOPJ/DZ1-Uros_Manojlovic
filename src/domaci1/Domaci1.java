package domaci1;

import java.util.Scanner;


public class Domaci1 {
    
    int matrica[][];
    public Domaci1(int n, int m) {matrica = new int [n][m];}
    
    public void ucitavanjeMatrice() {
        
        Scanner in = null;
        in = new Scanner(System.in);
        for (int i = 0; i < matrica.length; i++)
                for (int j = 0; j < matrica[i].length; j++)
                    matrica[i][j] = in.nextInt();
        in.close();
    }
    public int nalazenjeNajveceg() {
        
        int najveci = 0;
        for (int i = 0; i < matrica.length; i++)
                for (int j = 0; j < matrica[i].length; j++)
                    if(matrica[i][j] > najveci)
                        najveci = matrica[i][j];
        return najveci;
    }
    
    public void ispisivanjeMatrice() {
        
        for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < matrica[i].length; j++)
                    System.out.print(matrica[i][j] + "  ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = null;
        in = new Scanner(System.in);
        System.out.println("Unesite broj vrsta matrice.");
        int a = in.nextInt();
        System.out.println("Unesite broj kolona matrice.");
        int b = in.nextInt();
        Domaci1 d1 = new Domaci1(a,b);
        d1.ucitavanjeMatrice();
        d1.ispisivanjeMatrice();
        int najveci = d1.nalazenjeNajveceg();
        System.out.println("Najveci element matrice je: "+ najveci);
    } 
}
