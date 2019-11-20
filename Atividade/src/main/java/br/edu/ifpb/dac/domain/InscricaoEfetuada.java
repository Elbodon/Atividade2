package br.edu.ifpb.dac.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inscricoesEfetuadas")
public class InscricaoEfetuada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String transacao;
    private String status;
    private Integer quantidade;
    private Double valor;
    private String formapagamento;

    public InscricaoEfetuada() {
    }

    public InscricaoEfetuada(String transacao, String status, Integer quantidade, Double valor, String formapagamento) {
        this.transacao = transacao;
        this.status = status;
        this.quantidade = quantidade;
        this.valor = valor;
        this.formapagamento = formapagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransacao() {
        return transacao;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }
}
