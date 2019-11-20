package br.edu.ifpb.dac.domain;

import javax.naming.Name;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "participantes")
public class Participante  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    @Column(columnDefinition = "VARCHAR(100)")
    private String email;
    @Column(columnDefinition = "VARCHAR(100)")
    private String nomeCracha;
    @Column(columnDefinition = "VARCHAR(100)")
    private String instituicao;
    @Column(columnDefinition = "VARCHAR(15)")
    private String CPF;
    private String tipoUsuario;
    private String profissao;
    @Embedded
    private Contato contato;
    @Embedded
    private Endereco endereco;


    public Participante(String nome, String email, String nomeCracha, String instituicao, String CPF, String tipoUsuario, String profissao, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.nomeCracha = nomeCracha;
        this.instituicao = instituicao;
        this.CPF = CPF;
        this.tipoUsuario = tipoUsuario;
        this.profissao = profissao;
        this.contato = contato;
        this.endereco = endereco;
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

    
}
