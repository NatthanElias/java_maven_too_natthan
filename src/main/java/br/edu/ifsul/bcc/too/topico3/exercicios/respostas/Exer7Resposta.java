
package br.edu.ifsul.bcc.too.topico3.exercicios.respostas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author telmo
 */
public class Exer7Resposta {
    
    Exer7Resposta(){
        
          exer71();// chama o método exer71.
       
          //exer72();//chama o método exer72.
    }
    
    private void exer71(){
        
    /*
        7.1) Codifique uma classe chamada: Carro. Essa classe deve ter os seguintes atributos: nome, modelo, fabricante, numero do chassi  e valor de mercado. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes
             procedimentos: criar e inicializar cinco objetos da 
            classe Carro. 
           Adicione-os em uma lista da interface Map ordenada. Ao adicionar defina uma chave sequencial. Imprima na tela a listagem de carros.
    */
            
          Carro c1 = new Carro("Fusca", 
                              "1300L", "VW", 
                              "123abc", Double.parseDouble("7500"));
          
          
          Carro c2 = new Carro("Passsat", 
                               "pointer", "VW", 
                               "923abc", 9500.0);
          
          
          Carro c3 = new Carro("Gol", 
                               "Trend", "VW", 
                               "923abc", 9566.0);
          
          
          Carro c4 = new Carro("Parati", 
                               "LS", "VW", 
                               "923abc", 9550.0);
          
          
          Carro c5 = new Carro("Brasilia", 
                               "L", "VW", 
                               "923abc", 8500.0);
         
          
        
        Map<Integer, Carro> mapCarros = new HashMap();
                  
        
        mapCarros.put(5, c5);
        mapCarros.put(4, c4);
        mapCarros.put(1, c1);
        mapCarros.put(2, c2);
        mapCarros.put(3, c3);
                   
        System.out.println(mapCarros);

        /*
        System.out.println("Modelo do carro - codigo 1: " + 
                            mapCarros.get(1));
        System.out.println("Modelo do carro - codigo 2: " + 
                            mapCarros.get(2));
        */
      }    
    
    /*        
        7.2) Codifique uma classe chamada: Pneu. Essa classe deve ter os seguintes atributos: codigo, modelo, posição, medida, fabricante e valor. 
           O construtor (público) deverá receber dados para inicializar todos esses atributos. Sobrescreva o método toString para retornar o codigo e modelo.
           Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos: criar e inicializar quatro objetos da classe Pneu. 
           Adicione-os em uma lista. Implemente um mescanismo para classificar os objetos contidos nessa lista pelo modelo (descendente).
           Imprima na tela dos Pneus.
    */
    
    private void exer72(){
        
        List<Pneu> listaPneus = new ArrayList();
        
        Pneu p = new Pneu(1, "Ecopia", 1, "145/60/R13", "Magion tires", 250.00);//objeto p da classe Pneu que recebeu
        //uma instancia de Pneu.
     
        listaPneus.add(p);//adicionando o objeto p na lista.
        
        //iniciliza novamente o objeto p, que recebe uma nova instância.                
        p = new Pneu(2, "Eagle", null, null, null, 400.0);        
        
        listaPneus.add(p);//adicionando o objeto p na lista.
        
        p = new Pneu(33, "Pirelli P1", null, null, null, 799.0);                
        listaPneus.add(p);//adicionando o objeto p na lista.
        
        
        p = new Pneu(0, "Topline", null, null, null, 600.0);                
        listaPneus.add(p);//adicionando o objeto p na lista.
     
        System.out.println(listaPneus);//lista não classificada
        
        Collections.sort(listaPneus);//classifica a lista utilizando o compareTo da classe Pneu
        System.out.println("----------------------classificacao pelo modelo:");
        System.out.println(listaPneus);//lista classificada.
    }
        
    /*        
        7.3) Altere a classe Carro incluindo um atributo para armazenar uma lista de Pneus. Na classe Exercicio7 crie um novo método para realizar os seguintes procedimentos:
             criar e inicializar três objetos do tipo Carro. Para cada objeto do tipo Carro, adicione outros 4 objetos do tipo Pneu. Imprima na tela a lista de Carros e os seus respectivos Pneus.        
    */
    
      private void exer73(){
          
          Carro c = new Carro();
          
          Pneu p = new Pneu();
          
          c.setPneu(p);          
          
      }
    

    public static void main(String[] args) {
        
         new Exer7Resposta();
    }
    
}
