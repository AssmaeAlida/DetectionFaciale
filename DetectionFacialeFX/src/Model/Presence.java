package Model;

import java.sql.Date;
import java.util.List;

	public class Presence {
		private int id;
		private Date date;
		private Heures heure;
		private Employe employe;
		public Presence(int id, Date date, Heures heure, Employe employe) {
			super();
			this.id = id;
			this.date = date;
				this.heure = heure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Heures getHeure() {
		return heure;
	}
	public void setHeure(Heures heure) {
		this.heure = heure;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	@Override
	public String toString() {
		return "Presence [id=" + id + ", date=" + date + ", heure=" + heure + ", employe=" + employe + "]";
	}
	
	
	}
