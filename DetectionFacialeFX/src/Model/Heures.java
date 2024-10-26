package Model;

import java.util.List;

public class Heures {
private int id;
private int heureEntree;
private int heureSortie;
private int nbreHeuresParJour;
private List<Presence> presences;
public Heures(int id, int heureEntree, int heureSortie, int nbreHeuresParJour) {
	super();
	this.id = id;
	this.heureEntree = heureEntree;
	this.heureSortie = heureSortie;
	this.nbreHeuresParJour = nbreHeuresParJour;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getHeureEntree() {
	return heureEntree;
}
public void setHeureEntree(int heureEntree) {
	this.heureEntree = heureEntree;
}
public int getHeureSortie() {
	return heureSortie;
}
public void setHeureSortie(int heureSortie) {
	this.heureSortie = heureSortie;
}
public int getNbreHeuresParJour() {
	return nbreHeuresParJour;
}
public void setNbreHeuresParJour(int nbreHeuresParJour) {
	this.nbreHeuresParJour = nbreHeuresParJour;
}
public List<Presence> getPresences() {
	return presences;
}
public void setPresences(List<Presence> presences) {
	this.presences = presences;
}
@Override
public String toString() {
	return "Heures [id=" + id + ", heureEntree=" + heureEntree + ", heureSortie=" + heureSortie + ", nbreHeuresParJour="
			+ nbreHeuresParJour + ", presences=" + presences + "]";
}


}
