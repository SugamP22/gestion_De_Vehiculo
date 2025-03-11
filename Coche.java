
public class Coche extends Vehiculo {
	private int numeroPuertas;

	Coche(String nombre, int estadoAceleracion, int numeroPuertas) {
		super(nombre, estadoAceleracion);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	boolean agregarCoche() {

		return false;
	}



	@Override
	void mostrarInfo() {
		
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return super.toString()+"Coche [numeroPuertas=" + numeroPuertas + "]";
	}

}
