package service;

import java.util.List;

import javax.ejb.Remote;

import metier.Personne;
@Remote
public interface IPersonneServiceRemote {
	public void ajouterPersonne (Personne p);
	public List<Personne> findAll();
}
