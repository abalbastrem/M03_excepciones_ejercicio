/**
 * 
 */
package org.escoladeltreball.excepciones_ejercicio;

/**
 * @author iaw46994355.
 *
 */
public class validaDades {
	
	/**
	 * Constructor
	 */
	public validaDades() {
	}
	
	public boolean senseNumeros(String str) throws Exception {
		if ( str.matches(".*[0-9]+.*"))
            throw new Exception("los nombres no tienen numeros");
		return true;
	}
	
	

}