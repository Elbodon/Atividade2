package br.edu.ifpb.dac.domain;

import javax.persistence.*;
import javax.swing.plaf.multi.MultiPopupMenuUI;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "inscricoes")
public class Inscricao implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date dataInscricao;
    @Column(columnDefinition = "VARCHAR(100)")
    private String status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_participante")
    private Participante participante;
    private String idTransacao;
    private Double preco;
    private String tipoEvento;
    private String tipoParticipacao;


    public Inscricao(Date dataInscricao, String status, Participante participante, String id_transacao, Double preco, String tipoEvento, String tipoParticipacao) {
        this.dataInscricao = dataInscricao;
        this.status = status;
        this.participante = participante;
        this.idTransacao = idTransacao;
        this.preco = preco;
        this.tipoEvento = tipoEvento;
        this.tipoParticipacao = tipoParticipacao;
    }

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

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }
}
