/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Natthan
 */
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private Calendar data_nascimento;
    private String cep;
    private String complento;

    public Pessoa() {
        //pessoas = new List();
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the data_nascimento
     */
    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the complento
     */
    public String getComplento() {
        return complento;
    }

    /**
     * @param complento the complento to set
     */
    public void setComplento(String complento) {
        this.complento = complento;
    }
    
    
}
