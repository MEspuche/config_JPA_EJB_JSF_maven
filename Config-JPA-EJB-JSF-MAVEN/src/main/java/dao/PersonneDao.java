package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.Personne;

@Stateless
public class PersonneDao implements IPersonneDaoRemote,IPersonneDaoLocal {

	@PersistenceContext(name="ConfigPu")
	private EntityManager em;
	
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}


	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select p from Personne p");
		return req.getResultList();
	}

}
