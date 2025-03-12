
public class Coche extends Vehiculo implements MetodoVehiculo {
	private int numeroPuertas;

	Coche(String nombre, int garantia, int numeroPuertas) {
		super(nombre, garantia);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + ", Tipo=coche, numeroPuertas=" + numeroPuertas + "]";
	}

	@Override
	public void mostrarInfo() {
		System.out.println(this.toString());

	}

}
