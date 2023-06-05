
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class Funcionario extends Pessoa{
    
    //definição do atributo: numero_ctps
    private String numero_ctps;
    
    public Funcionario(String numero_ctps, String cpf){
        
        //coman do super: chama o construtor da classe mae
        
        
        super(cpf, null, null, null, null, 0, null, Calendar.getInstance(), Calendar.getInstance());
       
        this.numero_ctps = numero_ctps;
        
    }
    
    
    
    //criar um construtor publico e que recebe por parâmetros
    //informações para os atributos
    
    //métodos get e set para o atributo numero_ctps
}
