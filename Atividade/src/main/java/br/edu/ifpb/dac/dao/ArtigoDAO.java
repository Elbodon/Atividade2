package br.edu.ifpb.dac.dao;

import br.edu.ifpb.dac.domain.Artigo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ArtigoDAO {

    @PersistenceContext(unitName = "dac")
    EntityManager em;

    public void salvar(Artigo artigo){
        em.persist(artigo);
    }

    public void excluir(Artigo artigo){
        em.remove(artigo);
    }

    public void atualizar(Artigo artigo){
        em.merge(artigo);
    }

    public Artigo buscar(Artigo artigo){
        return em.find(Artigo.class, artigo);
    }

    public List<Artigo> buscarTodos(){
        return em.createQuery("SELECT a FROM Artigo a", Artigo.class).getResultList();
    }
}
