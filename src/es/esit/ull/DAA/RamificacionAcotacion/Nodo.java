package es.esit.ull.DAA.RamificacionAcotacion;

import java.util.ArrayList;

public class Nodo {
	private ArrayList<Double> coordenadas;
	
	public Nodo(ArrayList<Double> coordenadas) {
		this.coordenadas = new ArrayList<Double>();
		
		for (int i = 0; i < coordenadas.size(); i++) {
			this.coordenadas.add(coordenadas.get(i));
		}
	}
	
	public static Double distancia(Nodo nodo1, Nodo nodo2) {
		Double resultado = 0.0;
		
		// Falta.
		
		return Math.sqrt(resultado);
	}
}
