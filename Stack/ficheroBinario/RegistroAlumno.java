package ficheroBinario;

public class RegistroAlumno {
	
	String matr, apell, nombre, mail;
	int anio, mes;
	
	public RegistroAlumno(String matr, String apell, String nombre, String mail, int anio, int mes) {
		this.matr = matr;
		this.apell = apell;
		this.nombre = nombre;
		this.mail = mail;
		this.anio = anio;
		this.mes = mes;
	}

	public String aCadena() {
		// TODO Auto-generated method stub
		return matr + " - " + nombre + " - " + apell + " - " + mail + " - " + Integer.toString(anio) + " - " + Integer.toString(mes);
	}
}
