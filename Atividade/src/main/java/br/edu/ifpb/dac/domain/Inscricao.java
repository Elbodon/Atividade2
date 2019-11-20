package br.edu.ifpb.dac.domain;

import javax.persistence.*;
import javax.swing.plaf.multi.MultiPopupMenuUI;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inscricoes")
public class Inscricao implements Serializable{


    public enum TipoEvento { CONGRESSO, SIMPOSIO };

    @Id
    @GeneratedValue
    private Integer id;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date dataInscricao;
    private Double preco;
    private String tipoParticipacao;
    @Enumerated(EnumType.STRING)
    private  TipoEvento tipoEvento;

    public Inscricao() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
