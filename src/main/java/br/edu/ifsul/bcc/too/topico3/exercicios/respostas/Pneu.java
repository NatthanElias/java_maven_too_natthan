
package br.edu.ifsul.bcc.too.topico3.exercicios.respostas;

/**
 *
 * @author telmo
 */
    
public class Pneu implements Comparable<Pneu> {

    //codigo, modelo, posição, medida, fabricante e valor
    private Integer codigo;
    private String modelo;
    private Integer posicao;
    private String medida;
    private String fabricante;
    private Double valor;
    
    public Pneu(){
        
    }
    
    //sobrecarga de método: quando temos dois métodos com o mesmo nome,
    //porém com assinatura diferente (quantidade e tipo dos parâmetros).
    public Pneu(Integer codigo, 
                String modelo, 
                Integer posicao, 
                String medida, 
                String fabricante, 
                Double valor){
        
        this.codigo = codigo;
        this.modelo = modelo;
        this.valor = valor;
        //...
    }
    
        @Override
    public String toString(){
        
        return codigo + " - " + modelo;
    }

    @Override
    public int compareTo(Pneu t) {
        
        //vai retornar 1 se o t.modelo for maior do que o this.modelo
        //vai retornar 0 se t.modelo e this.modelo forem iguais
        //vai retornar -1 se t.modelo for menor do que o this.modelo
        //return t.modelo.compareTo(this.modelo);
        //System.out.println("t.valor : "+t.valor);
        //System.out.println("this.valor: "+this.valor);
        
        return this.valor.compareTo(t.valor);
        
    }

}
