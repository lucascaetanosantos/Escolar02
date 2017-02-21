package br.com.escolar.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.escolar.entity.Professor;
import br.com.escolar.util.HibernateUtil;

public class ProfessorDao {

    public void saveOrUpdate(Professor professor) {
	EntityManager em = HibernateUtil.geteEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	try {
	    if (professor.getId() == null)
		em.persist(professor);
	    else
		em.merge(professor);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    em.getTransaction().rollback();
	}
    }

    public void delete(Professor professor) {
	EntityManager em = HibernateUtil.geteEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	try {
	    Professor pr = em.find(Professor.class, professor.getId());
	    em.remove(pr);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    em.getTransaction().rollback();
	}
    }

    @SuppressWarnings("unchecked")
    public List<Professor> list() {
	List<Professor> result = null;
	try {
	    EntityManager em = HibernateUtil.geteEntityManagerFactory().createEntityManager();
	    Query query = em.createQuery("FROM Professor");
	    result = query.getResultList();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return result;
    }
}
