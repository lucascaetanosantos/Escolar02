package br.com.escolar.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static EntityManagerFactory emf;

    private HibernateUtil() {
    }

    public static EntityManagerFactory geteEntityManagerFactory() {
	if (emf == null) {
	    try {
		emf = Persistence.createEntityManagerFactory("escolar");
	    } catch (Exception ex) {
		System.err.println("A cria��o inicial do SessionFactory falhou!" + ex);
	    }
	}
	return emf;
    }
}
