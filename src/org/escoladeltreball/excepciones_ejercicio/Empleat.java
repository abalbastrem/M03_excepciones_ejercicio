/**
 * 
 */
package org.escoladeltreball.excepciones_ejercicio;

/**
 * @author iaw46994355
 *
 */
public class Empleat extends Persona {
	
	private long codi_empleat;
	private String carrec;
	private String jornada_laboral;
	private String estudis;
	private double salari;
	private String telefon;
	
	/**
	 * @param nom
	 * @param cognom1
	 * @param cognom2
	 * @param dni
	 * @param codi_empleat
	 * @param carrec
	 * @param jornada_laboral
	 * @param estudis
	 * @param salari
	 * @param telefon
	 */
	public Empleat(String nom, String cognom1, String cognom2, String dni, long codi_empleat, String carrec,
			String jornada_laboral, String estudis, double salari, String telefon) {
		super(nom, cognom1, cognom2, dni);
		this.codi_empleat = codi_empleat;
		this.carrec = carrec;
		this.jornada_laboral = jornada_laboral;
		this.estudis = estudis;
		this.salari = salari;
		this.telefon = telefon;
	}
	
	

}
