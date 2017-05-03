package dao;

import java.util.List;

import metier.Personne;

public interface IPersonneDaoLocal {
	public void ajouterPersonne (Personne p);
	public List<Personne> findAll();
}
