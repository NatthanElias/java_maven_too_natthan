
package br.edu.ifsul.bcc.too.topico3.exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Telmo Júnior
 */
public class Exercicio2 {
    
    static  int[][] rgDados1 = new int[3][3];
    
    static  int[][] rgDados2 = new int[3][3];
        
    static  int[][] rgDados3 = new int[3][3];
    
    public static void main(String[] args) {
        
        /*
            1) Com base no código fonte produzido no exercicio 1, 
        implemente um tratamento de exceção para tratar possível erro na conversão de 
               string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
        */
        
       Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < rgDados1.length; linha++) {

            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                System.out.print("Digite um valor para a primeira matriz: ");
                if (sc.hasNext()) {
                    boolean err;
                    do{
                        try {
                            err = false;
                            rgDados1[linha][coluna] = Integer.parseInt(sc.next());
                        } catch(NumberFormatException e) {
                            err = true;
                            System.out.println();
                        }
                   }while(err);
                }
            }
        }

        for (int linha = 0; linha < rgDados2.length; linha++) {

            for (int coluna = 0; coluna < rgDados2[linha].length; coluna++) {

                System.out.print("Digite um valor para a segunda matriz: ");
                if (sc.hasNext()) {
                    boolean err;
                    do{
                        try {
                            rgDados2[linha][coluna] = Integer.parseInt(sc.next());
                            err = false;
                        } catch(NumberFormatException e) {
                            err = true;
                            System.out.println("Digite um valor válido: ");
                        }
                   }while(err);
                }
            }
        }

        System.out.println("/nMatriz resultante da soma das duas informadas: ");
        for (int linha = 0; linha < rgDados2.length; linha++) {

            for (int coluna = 0; coluna < rgDados2[linha].length; coluna++) {

                    rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];
                    System.out.print(rgDados3[linha][coluna] + "\t");
                
            }
            System.out.println();
        }
        
    }
    
}
