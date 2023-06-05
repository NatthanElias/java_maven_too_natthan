
package br.edu.ifsul.bcc.too.topico3.exercicios.respostas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */

public class Carro {
    
   private String nome;
   private String modelo;
   private String fabricante;
   private String numeroChassi;
   private Double valor;
   
   private List<Pneu> pneus;
   
   public Carro(){
       
   }
   
   //construtor da classe com parâmetros.
   public Carro(String nome, 
                String modelo, 
                String fabricante, 
                String numeroChassi, 
                Double valor){
       
                //inicialização dos atributos da instancia.       
                this.nome = nome;
                this.modelo = modelo;
                this.fabricante = fabricante;
                this.numeroChassi = numeroChassi;
                this.valor= valor;
   }
   
   public void setPneu(Pneu p){
       
       if(pneus == null){
           pneus  = new ArrayList();
       }
       pneus.add(p);
   }
   
}