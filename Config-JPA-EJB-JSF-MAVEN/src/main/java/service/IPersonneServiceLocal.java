package service;

import java.util.List;

import javax.ejb.Local;

import metier.Personne;
@Local
public interface IPersonneServiceLocal {

	public void ajouterPersonne (Personne p);
	public List<Personne> findAll();
}
