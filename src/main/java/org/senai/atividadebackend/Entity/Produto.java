package org.senai.atividadebackend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;

    private String nome;
    private String descricao;
    private float valor;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getProduto() {
        return descricao;
    }
    public void setProduto(String descricao) {
        this.descricao = descricao;
    }
    public float getvalor() {
        return valor;
    }
    public void setvalor(float valor) {
        this.valor = valor;

    }



}
