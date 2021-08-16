package fr.eni.formation.projetTrocEnchere.bo;

import java.util.List;

public class Categorie {
	
	private int no_categorie;
	private String libelle;
	private List<ArticleVendu> lstArticle;
	
	
	public Categorie() {
		super();
	}
	
	public Categorie(int no_categorie, String libelle, List<ArticleVendu> lstArticle) {
		super();
		this.no_categorie = no_categorie;
		this.libelle = libelle;
		this.lstArticle = lstArticle;
	}

	public int getNo_categorie() {
		return no_categorie;
	}
	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<ArticleVendu> getLstArticle() {
		return lstArticle;
	}
	public void setLstArticle(List<ArticleVendu> lstArticle) {
		this.lstArticle = lstArticle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categorie [no_categorie=");
		builder.append(no_categorie);
		builder.append(", libelle=");
		builder.append(libelle);
		builder.append(", lstArticle=");
		builder.append(lstArticle);
		builder.append("]");
		return builder.toString();
	}
	
	
}
