/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author 20221PF.CC0015
 */

    
public class Questao1 {
    private String raw_data = "123,b,22,f,e,7,1,2,3";
    private java.util.List<Integer> dados = new java.util.ArrayList();
    private java.util.List<Integer> retorno = new java.util.ArrayList();

    public void converteDados(){
        int i=0;
        String d[] = raw_data.split(",");
        
        while(i < d.length){
            
            try {
                dados.add(Integer.parseInt(d[i]));
            }
            catch(NumberFormatException e) {
                dados.add(0);
            }
            
            i++;
        }
        
        
    }
    
    public void ordenaSemDuplicar() {
        
        for(int i = 0; i < dados.size(); i++) {
            
            if(!retorno.contains(dados.get(i))) 
                retorno.add(dados.get(i));
            
        }
        
        Collections.sort(retorno);
    }
    
    public Questao1(){
        converteDados();
        ordenaSemDuplicar();
    }
    
    public static void main(String args[]){
        Questao1 x = new Questao1();
        
        System.out.println(x.retorno);
    }
}

