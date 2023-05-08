/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagrama_classes;

import java.util.Calendar;

/**
 *
 * @author 20221PF.CC0015
 */
public class Pessoa {
    
    public String cpf;
    String rg;
    String nome;
    String logradouro;
    String cep;
    Integer numero;
    String telefone;
    Calendar data_cadastro;
    Integer idade;
    
    //Construtor pádrao: protegido e sem parametros
    public Pessoa() {
        
    }
    //polimorfismo: varias formas
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }
    
}
