package Guia05RomeroCandela;

import java.time.LocalDate;

public class Trabajo implements Contratable{
	Trabajador trabajador;
	Servicio servicio;
	Boolean urgente;
	LocalDate fechaFin;
	LocalDate fechaInicio;
	
	//constructor
	public Trabajo(Trabajador trabajador, Servicio servicio, Boolean urgente, LocalDate fechaFin, LocalDate fechaInicio) {
		super();
		this.trabajador = trabajador;
		this.urgente = urgente;
		this.servicio = servicio;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
	}
	
	//getters and setters
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Boolean getUrgente() {
		return urgente;
	}
	public void setUrgente(Boolean urgente) {
		this.urgente = urgente;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Double esUrgente() {
		return (urgente) ? 1.5 : 1;
	}

	@Override
	public Boolean finalizado() {
		// TODO Auto-generated method stub
		return (this.fechaFin==null) ? false : true;
	}

}
