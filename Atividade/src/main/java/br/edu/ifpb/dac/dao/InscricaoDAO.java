package br.edu.ifpb.dac.dao;

import br.edu.ifpb.dac.domain.Inscricao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class InscricaoDAO {
    @PersistenceContext(unitName = "dac")
    EntityManager em;

    public void salvar(Inscricao inscricao){
        em.persist(inscricao);
    }

    public void excluir(Inscricao inscricao){
        em.remove(inscricao);
    }

    public void atualizar(Inscricao inscricao){
        em.merge(inscricao);
    }

    public Inscricao buscar(Inscricao inscricao){
        return em.find(Inscricao.class, inscricao);
    }

    public List<Inscricao> buscarTodos(){
        return em.createQuery("SELECT i FROM Inscricao i", Inscricao.class).getResultList();
    }
}

