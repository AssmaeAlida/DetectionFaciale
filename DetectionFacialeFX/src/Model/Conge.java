package Model;



import java.sql.Date;

	public class Conge {
		private int id;
		private Date dateDebut;
		private Date dateFin;
		private Employe employe;

		public Conge(int id, Date dateDebut, Date dateFin, Employe employe) {
			super();
			this.id = id;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.employe = employe;
		}

		@Override
		public String toString() {
			return "Conge [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", employe=" + employe + "]";
		}


	}