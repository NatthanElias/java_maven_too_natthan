
package br.edu.ifsul.bcc.too.topico3.exercicios.respostas;

/**
 *
 * @author telmo
 */
public class Exer6Resposta {
    
  /*
        6) Implemente uma rotina para demonstrar/testar os modificadores static e FINAL.
    
            Documentação:  https://www.devmedia.com.br/modificadores-de-acesso-do-java/27065
    */
    
    final String dados = "123abc";
    
    public Exer6Resposta(){
        
        //não é possivel alterar uma variavel com o modificador final.
        //dados = dados + "."; 
    }
    
    public static void main(String args[]){
        
        //System.out.println("Acessando a variavel strDados da classe Resposta5 sem a criaçao de um objeto da classe : "+ Exer6Resposta.dados);
        
        new Exer6Resposta();
        
        
    }

    
}
