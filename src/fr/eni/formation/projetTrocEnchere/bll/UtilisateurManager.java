package fr.eni.formation.projetTrocEnchere.bll;

import java.util.List;

import fr.eni.formation.projetTrocEnchere.bo.Utilisateur;

public interface UtilisateurManager {

	public void addUtilisateur(Utilisateur utilisateur)throws BLLException;
	
	public void deleteUtilisateur(Utilisateur utilisateur)throws BLLException;
	
	public void updateUtilisateur(Utilisateur utilisateur)throws BLLException;
	
	public List<Utilisateur> getAllUtilisateur()throws BLLException;
	
	public Utilisateur getUtilisateurById(int id)throws BLLException;
}
