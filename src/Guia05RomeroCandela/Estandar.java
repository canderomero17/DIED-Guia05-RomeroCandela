package Guia05RomeroCandela;

public class Estandar extends Servicio {
	private double montoFijo;
	private Trabajador trabajador;

	//constructor
	public Estandar(double montoFijo, Trabajador trabajador) {
		super();
		this.montoFijo = montoFijo;
		this.trabajador = trabajador;
	}
	
	public double calcularCosto() {
		return (montoFijo+trabajador.getpocentajeComision()); //suponiendo que la comision se ingrese como (1+(porcentaje))/100
	}
	
}
