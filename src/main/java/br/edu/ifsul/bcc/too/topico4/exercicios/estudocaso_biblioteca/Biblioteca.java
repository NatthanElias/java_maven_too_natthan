/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;

import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagrama_classes.Pessoa;



/**
 *
 * @author 20221PF.CC0015
 */
public class Biblioteca {
    
    Biblioteca() {
        
        Pessoa p = new Pessoa("000123");
        System.out.println("CPF: " + p.cpf);
        
        //definir valores para os demias atributos do obj
        
        p.rg = "123456";
        p.nome = "ROgerin";
        p.logradouro = "Avenida Prsidente Vargas";
        p.cep = "990000";
        p.numero = 123456;
        
        
    }
    
    public static void main(String args[]) {
        new Biblioteca();
    }
}
