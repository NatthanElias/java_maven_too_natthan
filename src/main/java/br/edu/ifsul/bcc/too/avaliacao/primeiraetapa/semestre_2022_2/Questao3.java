package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20221PF.CC0015
 */
public class Questao3 {
    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};
    public Questao3(){
        ordena();
    }
    
    public void ordena() {
        int aux;
        
        for(int i = 0; i < dados.length; i++) {
            for(int j = i+1; j < dados.length; j++) {
                if(dados[i] > dados[j]) {
                    aux = dados[i];
                    dados[i] = dados[j];
                    dados[j] = aux;
                }
            }
        }
        
        for(int x : dados)
            System.out.print(x+", ");
    }
    public static void main(String args[]){
    new Questao3();
    }
}