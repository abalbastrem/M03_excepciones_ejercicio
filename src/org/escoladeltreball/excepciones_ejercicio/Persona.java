/**
 * 
 */
package org.escoladeltreball.excepciones_ejercicio;

/**
 * @author iaw46994355
 *
 */
public class Persona {
	
	private String nom;
	private String cognom1;
	private String cognom2;
	private String dni;
	
	
	
	/**
	 * @param nom
	 * @param cognom1
	 * @param cognom2
	 * @param dni
	 */
	public Persona(String nom, String cognom1, String cognom2, String dni) {
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.dni = dni;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the cognom1
	 */
	public String getCognom1() {
		return cognom1;
	}
	/**
	 * @param cognom1 the cognom1 to set
	 */
	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}
	/**
	 * @return the cognom2
	 */
	public String getCognom2() {
		return cognom2;
	}
	/**
	 * @param cognom2 the cognom2 to set
	 */
	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
