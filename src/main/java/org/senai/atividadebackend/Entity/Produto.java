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
<<<<<<< HEAD
    private String nome;
    private String descricao;
    private float valor;
=======
    private String Nome;
    private String Descricao;
    private float Valor;
>>>>>>> fd6269c1252b73fd5af8d10071ae753abda03322


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
<<<<<<< HEAD
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
=======
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getProduto() {
        return Descricao;
    }
    public void setProduto(String Descricao) {
        this.Descricao = Descricao;
    }
    public float getValor() {
        return Valor;
    }
    public void setValor(float Valor) {
        this.Valor = Valor;
>>>>>>> fd6269c1252b73fd5af8d10071ae753abda03322
    }



}
