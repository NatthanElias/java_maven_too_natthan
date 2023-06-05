
package br.edu.ifsul.bcc.too.topico3.exercicios.respostas;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author telmo
 */
public class Compra {
    
    public Integer codigo;
    public Calendar emissao;
    public Date saida;
    
    public Compra(Integer codigo, Calendar emissao, Date saida){
        
        this.codigo = codigo;
        this.emissao = emissao;
        this.saida = saida;
    }
    
   
    
}
