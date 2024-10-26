package Model;

	
	public class Salaire {
		private int id;
		private String mois;
		private double totalPaye;
		private double prixHeure;
		private double heureTravaille;
		private Employe employe;
	
	
	public Salaire(int id, String mois, double totalPaye, double prixHeure, double heureTravaille, Employe employe) {
		super();
		this.id = id;
		this.mois = mois;
		this.totalPaye = totalPaye;
		this.prixHeure = prixHeure;
		this.heureTravaille = heureTravaille;
		this.employe = employe;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public double getTotalPaye() {
		return totalPaye;
	}
	public void setTotalPaye(double totalPaye) {
		this.totalPaye = totalPaye;
	}
	public double getPrixHeure() {
		return prixHeure;
	}
	public void setPrixHeure(double prixHeure) {
		this.prixHeure = prixHeure;
	}
	public double getHeureTravaille() {
		return heureTravaille;
	}
	public void setHeureTravaille(double heureTravaille) {
		this.heureTravaille = heureTravaille;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
	@Override
	public String toString() {
		return "Salaire [id=" + id + ", mois=" + mois + ", totalPaye=" + totalPaye + ", prixHeure=" + prixHeure
				+ ", heureTravaille=" + heureTravaille + ", employe=" + employe + "]";
	}
	
	
	}