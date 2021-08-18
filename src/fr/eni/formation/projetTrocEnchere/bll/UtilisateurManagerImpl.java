package fr.eni.formation.projetTrocEnchere.bll;

import java.util.List;

import fr.eni.formation.projetTrocEnchere.bo.Utilisateur;
import fr.eni.formation.projetTrocEnchere.dal.DALException;
import fr.eni.formation.projetTrocEnchere.dal.DAOFact;
import fr.eni.formation.projetTrocEnchere.dal.UtilisateurDAO;

public class UtilisateurManagerImpl implements UtilisateurManager {

	UtilisateurDAO dao = DAOFact.getUtilisateurDAO();
	
	@Override
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException {
		try {
			dao.insert(utilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) throws BLLException{
		try {
			dao.delete(utilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur) throws BLLException{
		try {
			dao.update(utilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Utilisateur> getAllUtilisateur() throws BLLException{
		try {
			return dao.getAll();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Utilisateur getUtilisateurById(int id) throws BLLException{
		try {
			return dao.getById(id);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
