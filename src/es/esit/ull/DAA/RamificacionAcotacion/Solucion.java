package es.esit.ull.DAA.RamificacionAcotacion;

import java.util.ArrayList;

public class Solucion {
	private Integer numeroElementos;
	private Integer dimension;
	private ArrayList<Elemento> conjuntoSolucion;
	private ArrayList<Boolean> solucion;

	public Solucion() {
		this.numeroElementos = 0;
		this.dimension = 0;
		this.conjuntoSolucion = new ArrayList<Elemento>();
		this.solucion = new ArrayList<Boolean>();
	}

	public Solucion(Integer numeroElementos, Integer dimension, ArrayList<Elemento> conjuntoSolucion) {
		this.numeroElementos = numeroElementos;
		this.dimension = dimension;
		this.conjuntoSolucion = igualar(conjuntoSolucion);
		construirSolucion();
	}

	public Solucion(Problema p) {
		this.numeroElementos = p.getNumeroElementos();
		this.dimension = p.getDimension();
		this.conjuntoSolucion = igualar(p.getDominio());
		construirSolucion();
	}
	/**
	 * Devuelve un vector booleano donde true = pertenece a la solución, false = no pertenece.
	 */
	public void construirSolucion() {
		this.solucion = new ArrayList<Boolean>();
		for (int i = 0; i < getConjuntoSolucion().size(); i++) {
			if (getConjuntoSolucion().get(i).getId() == i) {
				solucion.add(true);
			} else {
				solucion.add(false);
			}
		}

	}

	public void addElemento(Elemento e) {
		for (int i = 0; i < getConjuntoSolucion().size(); i++) {
			getConjuntoSolucion().add(e);
			setNumeroElementos(getConjuntoSolucion().size());
			setDimension(e.getDistancias().size());
		}
	}

	public void eliminarElemento(Elemento e) {
		for (int i = 0; i < getConjuntoSolucion().size(); i++) {
			if (e.getId() == getConjuntoSolucion().get(i).getId()) {
				getConjuntoSolucion().remove(i);
				setNumeroElementos(getConjuntoSolucion().size());
			}
		}
	}
	/**
	 * Iguala dos Arrays de elementos.
	 * @param conjuntoSolucion2
	 * @return
	 */	
	private ArrayList<Elemento> igualar(ArrayList<Elemento> conjuntoSolucion2) {
		ArrayList<Elemento> aux = new ArrayList<Elemento>();
		for (int i = 0; i < conjuntoSolucion2.size(); i++) {
			aux.add(conjuntoSolucion2.get(i));
		}
		return aux;
	}

	/**
	 * Muestra la solución en el formato del fichero.
	 */
	public void mostrarConjuntoSolucion() {

		System.out.println("Número de elementos -> " + getNumeroElementos());
		System.out.println("Dimensión -> " + getDimension());
		System.out.println("");
		System.out.print("***Conjunto S***");
		for (int i = 0; i < getNumeroElementos(); i++) {
			System.out.println();
			System.out.print("Elemento " +  getConjuntoSolucion().get(i).getId() + "= { ");
			for (int j = 0; j < getDimension(); j++) {
				System.out.print(" (" + getConjuntoSolucion().get(i).getDistancias().get(j) + ") ");
			}
			System.out.print(" }");
		}		
	}

	/**
	 * Muestra el problema tal y como está en el fichero.
	 */
	public void mostrarSolucion() {

		System.out.print("Solucion = { ");
		for (int i = 0; i < getNumeroElementos(); i++) {
			System.out.println(" (" + getSolucion().get(i) + ") ");
		}	
		System.out.println(" }");
	}
	/*
	 * Getter & Setter
	 */

	public Integer getNumeroElementos() {
		return numeroElementos;
	}

	public ArrayList<Boolean> getSolucion() {
		return solucion;
	}

	public void setSolucion(ArrayList<Boolean> solucion) {
		this.solucion = solucion;
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

	public ArrayList<Elemento> getConjuntoSolucion() {
		return conjuntoSolucion;
	}

	public void setConjuntoSolucion(ArrayList<Elemento> conjuntoSolucion) {
		this.conjuntoSolucion = conjuntoSolucion;
	}

}
