package br.edu.ifpb.dac.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "artigos")
public class Artigo implements Serializable {

    @Id
    private Integer id;
    @Column(length = 200, nullable = false)
    private String titulo;
    private String orientador;
    private String coautores;
    private String modalidade;
    @Temporal(TemporalType.DATE)
    private Date dataSubmissao;
    private String urlDownload;

    public Artigo(){

    }

    public Artigo(Integer id, String titulo, String orientador, String coautores, String modalidade, Date dataSubmissao, String urlDownload) {
        this.id = id;
        this.titulo = titulo;
        this.orientador = orientador;
        this.coautores = coautores;
        this.modalidade = modalidade;
        this.dataSubmissao = dataSubmissao;
        this.urlDownload = urlDownload;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCouautores() {
        return coautores;
    }

    public void setCouautores(String couautores) {
        this.coautores = couautores;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Date getDataSubmissao() {
        return dataSubmissao;
    }

    public void setDataSubmissao(Date dataSubmissao) {
        this.dataSubmissao = dataSubmissao;
    }

    public String getUrlDownload() {
        return urlDownload;
    }

    public void setUrlDownload(String urlDownload) {
        this.urlDownload = urlDownload;
    }
}
