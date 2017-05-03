package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dao.IPersonneDaoLocal;
import metier.Personne;
@Stateless
public class PersonneService implements IPersonneServiceLocal, IPersonneServiceRemote{

	@EJB
	private IPersonneDaoLocal dao;
	
	public void ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		dao.ajouterPersonne(p);
	}

	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
