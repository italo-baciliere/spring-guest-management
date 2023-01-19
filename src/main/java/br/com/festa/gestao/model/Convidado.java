package br.com.festa.gestao.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Convidado {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "incrememt", strategy="increment")
    private Long id;

    private String nome;
    private Integer quantidadeAcompanhantes;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
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
     * @return Integer return the quantidadeAcompanhantes
     */
    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    /**
     * @param quantidadeAcompanhantes the quantidadeAcompanhantes to set
     */
    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }

}