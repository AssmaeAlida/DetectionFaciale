package Model;


import java.sql.Date;

public class Admin extends Employe{

    private String login;
    private String password;
    
    public Admin(int id, String nom, String prenom, Date dateNaissance, Date dateAjout, String departement, String email,
		String telephone, String fonction, String login, String password) {
	super( nom, prenom, dateNaissance,  departement, email, telephone, fonction);
	// TODO Auto-generated constructor stub
	//this.id = admin_id;
	this.login = login; 
	this.password = password;
}
    /*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
    public String getLogin() {
    	return login;
    }
    public void setLogin(String login) {
    	this.login = login;
    }
    public String getPassword() {
    	return password;
    }
    public void setPassword(String password) {
    	this.password = password;
    }

    @Override
	public String toString() {
    	return "Admin [login=" + login + ", password=" + password + "]";
    }




}
