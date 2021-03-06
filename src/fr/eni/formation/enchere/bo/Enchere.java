package fr.eni.formation.enchere.bo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Enchere {

	private LocalDateTime date_enchere;
	private int montant_enchere;
	private Utilisateur utilisateur;
	private ArticleVendu article;

	public Enchere() {
		super();
	}

	public Enchere(LocalDateTime date_enchere, int montant_enchere, Utilisateur utilisateur, ArticleVendu article) {
		super();
		this.date_enchere = date_enchere;
		this.montant_enchere = montant_enchere;
		this.utilisateur = utilisateur;
		this.article = article;
	}

	public LocalDateTime getDate_enchere() {
		return date_enchere;
	}

	public void setDate_enchere(LocalDateTime date_enchere) {
		this.date_enchere = date_enchere;
	}

	public int getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public ArticleVendu getArticle() {
		return article;
	}

	public void setArticle(ArticleVendu article) {
		this.article = article;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enchere [date_enchere=");
		builder.append(date_enchere);
		builder.append(", montant_enchere=");
		builder.append(montant_enchere);
		builder.append(", utilisateur=");
		builder.append(utilisateur);
		builder.append(", article=");
		builder.append(article);
		builder.append("]");
		return builder.toString();
	}

}
