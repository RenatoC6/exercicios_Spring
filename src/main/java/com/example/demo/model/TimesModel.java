package com.example.demo.model;

import jakarta.persistence.*;
import org.hibernate.dialect.function.TruncFunction;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "times")
public class TimesModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String pais;
    private LocalDateTime fundacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDateTime getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDateTime fundacao) {
        this.fundacao = fundacao;
    }

    @Override
    public String toString() {
        return "TimesModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                ", fundacao=" + fundacao +
                '}';
    }
}
