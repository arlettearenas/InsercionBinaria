/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insercionbinario;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class InsercionBinario {
	public static void main(String[] args) {
		
		int[] num = {11,45,67,27,89,84,65,21,44};
		int numinterse =45;
		
		Arrays.sort(num);
		
/* Si está en el array la respuesta es la posición del número en un array ordenado
* si no devuelve el número de elementos que ha tenido que recorrer hasta buscarlo 
*/
		
		if (Arrays.binarySearch(num, numinterse)>0)
			System.out.println("El número " + numinterse + " está en el array");
		else 
			System.out.println("El número " + numinterse + " no está en el array");

	}

}

