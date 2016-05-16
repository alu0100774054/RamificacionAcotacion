package es.esit.ull.DAA.RamificacionAcotacion;

import java.util.ArrayList;

public class ConstructivoVoraz {
	private Problema problema;
	private Solucion solucion;
	private Integer objetivo;	// Número de subconjunto que se desean.
	
	public ConstructivoVoraz(Problema problema, Integer objetivo) {
		this.problema = problema;
		this.solucion = new Solucion();
		this.objetivo = objetivo;
	}
	
	public void resolver() {
		Solucion solucionDePartida = new Solucion(getProblema());
		Elemento sc = obtenerCentroGravedad(solucionDePartida.getConjuntoSolucion());
		while (getSolucion().getConjuntoSolucion().size() < getObjetivo()) {
			Elemento masAlejado = obtenerElementoMasLejano(sc);
			getSolucion().addElemento(masAlejado);
			solucionDePartida.eliminarElemento(masAlejado);
			sc = obtenerCentroGravedad(getSolucion().getConjuntoSolucion());
		}
	}

	private Elemento obtenerElementoMasLejano(Elemento sc) {
		Elemento resultado = null;
		
		//Obtener el mas alejado.
		
		return resultado;
	}

	private Elemento obtenerCentroGravedad(ArrayList<Elemento> conjunto) {
		Elemento centro = null;
		for (int i = 0; i < problema.getDominio().size(); i++) {
			// Calcular el centro de gravedad.
		}
		return null;
	}

	/*
	 * Getter & Setter
	 */
	public Integer getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Integer objetivo) {
		this.objetivo = objetivo;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public Solucion getSolucion() {
		return solucion;
	}

	public void setSolucion(Solucion solucion) {
		this.solucion = solucion;
	}
	
	
}
