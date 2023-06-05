
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Livro {
    
    //atributos: id e titulo e PalavrasChave
    private Integer id;
    private String nome;
    //tipo de relacionamento: agregação (losango não preenchido) 
    private Collection<PalavrasChave> palavrasChave;
    
    //dois construtores
    
    //2 métodos get e set.
}
