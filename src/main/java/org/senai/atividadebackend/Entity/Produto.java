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
    private String Nome;
    private String Descricao;
    private float Valor;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    }



}
