
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class Aluno extends Pessoa {
    
    //atributo: matricula
    private String matricula;
    
    Aluno(){
        
    }
     //construtor publico e com parâmetro.
    public Aluno(String matricula, String cpf, String rg, String nome, String logradouro, String cep, Integer numero, String telefone, Calendar datacadastro, Calendar datanascimento){
        
        //comando super: chama o construtor da classe mae.
        
        super(cpf, rg, nome, logradouro, cep, numero, telefone, datacadastro, datanascimento);
        
        this.matricula = matricula;
    }
    
    
    //metodo get e set.

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
