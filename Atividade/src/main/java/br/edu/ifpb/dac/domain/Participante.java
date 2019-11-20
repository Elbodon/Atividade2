package br.edu.ifpb.dac.domain;

import javax.naming.Name;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "participantes")
public class Participante  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "participante_sequence")
    @SequenceGenerator(name = "participante_sequence", sequenceName = "part_seq")
    private Integer id;
    private String nome;
    private String email;
    private String nomeCracha;
    private String instituicao;
    private String CPF;
    private String tipoUsuario;
    private String profissao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato_participante")
    private Contato contato;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Artigo> artigo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes;

    public Participante(String nome, String email, String nomeCracha, String instituicao, String CPF, String tipoUsuario, String profissao, Contato contato, Endereco endereco, List<Artigo> artigo, List<Inscricao> inscricoes) {
        this.nome = nome;
        this.email = email;
        this.nomeCracha = nomeCracha;
        this.instituicao = instituicao;
        this.CPF = CPF;
        this.tipoUsuario = tipoUsuario;
        this.profissao = profissao;
        this.contato = contato;
        this.endereco = endereco;
        this.artigo = artigo;
        this.inscricoes = inscricoes;
    }

    public Participante() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCracha() {
        return nomeCracha;
    }

    public void setNomeCracha(String nomeCracha) {
        this.nomeCracha = nomeCracha;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Artigo> getArtigo() {
        return artigo;
    }

    public void setArtigo(List<Artigo> artigo) {
        this.artigo = artigo;
    }

    public List<Inscricao> getInscricaos() {
        return inscricoes;
    }

    public void setInscricaos(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }
    
}
