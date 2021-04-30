package Guia05RomeroCandela;

import java.util.List;

public class Trabajador {
	
	private String nombre;
	private String email;
	private Oficio oficio;
	private double costoHora;
	private List<Trabajo> trabajosAsignados;
	private double porcentajeComision;
	
	//constructor
	public Trabajador(String nombre, String email, Oficio oficio, double costoHora, List<Trabajo> trabajosAsignados,
			double porcentajeComision) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.oficio = oficio;
		this.costoHora = costoHora;
		this.trabajosAsignados = trabajosAsignados;
		this.porcentajeComision = porcentajeComision;
	}
	
	public void agregarTareas(List<Trabajo> trabajosAsignados, Trabajo nuevoTrabajo) throws OficioNoCoincideException, AgendaOcupadaException {
		if (this.oficio!=nuevoTrabajo.trabajador.oficio) {
			throw new OficioNoCoincideException();
		}
		for(int i=0;i<trabajosAsignados.size();i++) {
			if ((nuevoTrabajo.fechaInicio)==(this.trabajosAsignados.get(i).fechaInicio)) { 
				throw new AgendaOcupadaException();
			}
		}
		trabajosAsignados.add(nuevoTrabajo); 
	}
		
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Oficio getOficio() {
		return oficio;
	}
	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}
	public double getCostoHora() {
		return costoHora;
	}
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}
	public List<Trabajo> getTrabajosAsignados() {
		return trabajosAsignados;
	}
	public void setTrabajosAsignados(List<Trabajo> trabajosAsignados) {
		this.trabajosAsignados = trabajosAsignados;
	}
	public double getpocentajeComision() {
		return porcentajeComision;
	}
	public void setporcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	
	
}
