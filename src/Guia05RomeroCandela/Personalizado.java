package Guia05RomeroCandela;

public class Personalizado extends Servicio{
	double valorPresupuestado;
	double costoMateriales;
	double costoTransporte;
	
	//constructor
	public Personalizado(double valorPresupuestado, double costoMateriales, double costoTransporte) {
		super();
		this.valorPresupuestado = valorPresupuestado;
		this.costoMateriales = costoMateriales;
		this.costoTransporte = costoTransporte;
	}
	
	public double calcularCosto() {
		return (this.valorPresupuestado+this.costoMateriales+this.costoTransporte);
	}

}
