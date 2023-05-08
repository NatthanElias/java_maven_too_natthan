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
    public String rg;
    public String nome;
    public String logradouro;
    public String cep;
    public Integer numero;
    public String telefone;
    public Calendar data_cadastro;
    public Integer idade;
    
    //Construtor pádrao: protegido e sem parametros
    public Pessoa() {
        
    }
    //polimorfismo: varias formas
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }
    
}
