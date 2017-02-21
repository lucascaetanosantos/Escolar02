package br.com.escolar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.escolar.entity.Aluno;
import br.com.escolar.util.HibernateUtil;

public class AlunoDao {
    public void saveOrUpdate(Aluno aluno) {
	EntityManager em = HibernateUtil.geteEntityManagerFactory().createEntityManager();
	try {
	    em.getTransaction().begin();
	    if (aluno.getId() == null)
		em.persist(aluno);
	    else
		em.merge(aluno);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    em.getTransaction().rollback();
	}
    }

    public void delete(Aluno aluno) {
	EntityManager em = HibernateUtil.geteEntityManagerFactory().createEntityManager();
	try {
	    em.getTransaction().begin();
	    Aluno al = em.find(Aluno.class, aluno.getId());
	    em.remove(al);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    em.getTransaction().rollback();
	}
    }

    @SuppressWarnings("unchecked")
    public List<Aluno> list() {
	List<Aluno> result = null;
	try {
	    EntityManager em = HibernateUtil.geteEntityManagerFactory().createEntityManager();
	    Query query = em.createQuery("FROM Aluno");
	    result = query.getResultList();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return result;
    }
}
