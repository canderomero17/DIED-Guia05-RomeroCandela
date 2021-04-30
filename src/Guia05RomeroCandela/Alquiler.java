package Guia05RomeroCandela;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler implements Contratable {
	private Herramienta herramienta;
	private LocalDate fechaInicio;
	private LocalDate fechaEntrega;
	private LocalDate fechaDevolucion;

	public Double precio() {
		return null;
	}
	
	//constructor
	public Alquiler(Herramienta herramienta, LocalDate fechaInicio, LocalDate fechaEntrega, LocalDate fechaDevolucion) {
		super();
		this.herramienta = herramienta;
		this.fechaInicio = fechaInicio;
		this.fechaEntrega = fechaEntrega;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	//calcular diferencia fecha inicio y fecha entrega
	public int diferenciasFechas() {
		LocalDate f1 = fechaInicio;
		LocalDate f2 = fechaEntrega;
		Period diferencia = Period.between(f1,f2);
		return diferencia.getDays();
	}
	
	//calcular costo alquiler
	public Double calcularCosto() {
		return((this.herramienta.getCostoDiario())*(this.diferenciasFechas()));
	}
	
	//metodo en mora 
	public Boolean enMora() {
		if ((this.fechaEntrega.isBefore(fechaDevolucion)) | ((this.fechaDevolucion==null) & (fechaEntrega.isBefore(LocalDate.now())))) {
			return true;
		} else {
			return false;
		}
	}
	
	//getters and setters
	public Herramienta getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public Boolean finalizado() {
		// TODO Auto-generated method stub
		return (this.enMora()) ? false : true;
	}



	
	

}
