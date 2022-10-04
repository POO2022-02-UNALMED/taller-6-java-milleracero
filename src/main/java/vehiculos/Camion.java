package vehiculos;

public class Camion extends vehiculo {

	private int ejes;
	
	public Camion(String placa, String nombre, int peso, int precio, Fabricante fabricante, int ejes){
		super(placa, 2, 80, nombre, precio, peso, "4X2",fabricante);
		this.ejes = ejes;
	}
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
