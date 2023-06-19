/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

/**
 *
 * @author Natthan
 */
public class Cliente extends Pessoa{
    private String observacoes;
    private Veiculo carro;

    public Cliente() {
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the carro
     */
    public Veiculo getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }
    
    
}
