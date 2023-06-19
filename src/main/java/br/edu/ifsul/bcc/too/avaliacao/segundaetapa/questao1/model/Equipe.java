/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

/**
 *
 * @author Natthan
 */
public class Equipe {
    private Integer id;
    private String nome;
    private String especialidades;
    private Pessoa func;

    public Equipe() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return the especialidades
     */
    public String getEspecialidades() {
        return especialidades;
    }

    /**
     * @param especialidades the especialidades to set
     */
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    
    
}
