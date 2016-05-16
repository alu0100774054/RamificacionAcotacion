package es.esit.ull.DAA.RamificacionAcotacion;

import java.util.ArrayList;

public class Elemento {
	private int id;							// Número del elemento.
	private ArrayList<Double> distancias;
	
	/**
	 * Construye una estructua elemento.
	 * @param distancias otra estructura
	 */
	public Elemento(int id, ArrayList<Double> distancias) {
		this.id = id;
		this.distancias = new ArrayList<Double>();
		for (int i = 0; i < distancias.size(); i++) {
			this.distancias.add(distancias.get(i));
		}
	}

	/*
	 * Getter & Setter.
	 */
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Double> getDistancias() {
		return distancias;
	}

	public void setDistancias(ArrayList<Double> distancias) {
		this.distancias = distancias;
	}
	
}
