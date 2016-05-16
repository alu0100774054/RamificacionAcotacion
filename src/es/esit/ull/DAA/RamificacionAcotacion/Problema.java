package es.esit.ull.DAA.RamificacionAcotacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problema {
	private Integer numeroElementos;
	private Integer dimension;
	private ArrayList<Elemento> dominio;

	public Problema(String nombreFichero) throws FileNotFoundException {
		dominio = new ArrayList<Elemento>();
		leerFichero(nombreFichero);
	}

	/**
	 * Construye el problema leyendo los datos desde un fichero
	 * @param nombreFichero	Nombre del fichero.
	 * @throws FileNotFoundException
	 */
	private void leerFichero(String nombreFichero) throws FileNotFoundException {

		File fichero = new File(nombreFichero);
		Scanner s = new Scanner(fichero);
		String entrada = null;

		// Número de elementos.
		entrada = s.nextLine();
		setNumeroElementos(Integer.parseInt(entrada));
		
		// Dimension
		entrada = s.nextLine();
		setDimension(Integer.parseInt(entrada));

		ArrayList<Double> distancias;

		for (int i = 0; i < getNumeroElementos(); i++) {
			distancias = new ArrayList<Double>();
			entrada = s.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(entrada, " ");
			for (int j = 0; j < getDimension(); j++) {
				distancias.add(Double.parseDouble(tokenizer.nextToken()));
			}
			getDominio().add(new Elemento(i, distancias));
		}
	}

	/**
	 * Muestra el problema tal y como está en el fichero.
	 */
	public void mostrarProblema() {
		
		System.out.println("Número de elementos -> " + getNumeroElementos());
		System.out.println("Dimensión -> " + getDimension());
		System.out.println("");
		System.out.print("***Conjunto S***");
		for (int i = 0; i < getNumeroElementos(); i++) {
			System.out.println();
			System.out.print("Elemento " +  getDominio().get(i).getId() + "= { ");
			for (int j = 0; j < getDimension(); j++) {
				System.out.print(" (" + getDominio().get(i).getDistancias().get(j) + ") ");
			}
			System.out.print(" }");
		}		
	}

	/*
	 * Getter & Setter
	 */

	public Integer getNumeroElementos() {
		return numeroElementos;
	}

	public ArrayList<Elemento> getDominio() {
		return dominio;
	}

	public void setDominio(ArrayList<Elemento> dominio) {
		this.dominio = dominio;
	}

	public void setNumeroElementos(Integer numeroElementos) {
		this.numeroElementos = numeroElementos;
	}

	public Integer getDimension() {
		return dimension;
	}

	public void setDimension(Integer dimension) {
		this.dimension = dimension;
	}


}
