package vehiculos;

import java.util.ArrayList;

public class Fabricante  {
	
	private String nombre;
	private Pais pais;
	public static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();
	
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int cant = 0;
		Fabricante max = null;
		
		for (int i = 0; i<fabricas.size(); i++ ) {
			int cont = 0;
			for(int j = 0; j<fabricas.size();j++) {
				if (fabricas.get(i) == fabricas.get(j)) {
					cont++;
				}
			}
			
			if (cont > cant) {
				cant = cont;
				max = fabricas.get(i);
			}
		}
		
		return max;
	}
}
