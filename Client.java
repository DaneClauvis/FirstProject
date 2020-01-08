package GL.org.TP2JaCoCo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Client {
	public int ID;
	public String nom;
	public String prenom;
	public Date date_naiss;
	public String email;
	public String tel;
	public String password;
	public int TpsFid;
	public Client(int iD, String nom, String prenom, Date date_naiss, String email, String tel, String password,
			int tpsFid) {
		
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naiss = date_naiss;
		this.email = email;
		this.tel = tel;
		this.password = password;
		TpsFid = tpsFid;
	}
	public Client() {
		
	}
	@Override
	public String toString() {
		return "Client [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + ", date_naiss=" + date_naiss + ", email="
				+ email + ", tel=" + tel + ", password=" + password + ", TpsFid=" + TpsFid + "]";
	}
	
	public int CalculAge() {
		int age = Calendar.getInstance().get(Calendar.YEAR)- this.date_naiss.getYear()-1900;
		
		return age;
	}
	
	public void AddPtsFid(int p) {
		
		TpsFid =p;	
	}
	
	

}
