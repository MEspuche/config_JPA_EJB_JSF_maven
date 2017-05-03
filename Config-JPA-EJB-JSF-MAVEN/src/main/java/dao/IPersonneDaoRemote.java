package dao;

import java.util.List;

import metier.Personne;

public interface IPersonneDaoRemote {
	public void ajouterPersonne (Personne p);
	public List<Personne> findAll();
}
