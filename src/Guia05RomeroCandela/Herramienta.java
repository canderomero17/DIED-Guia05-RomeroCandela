package Guia05RomeroCandela;

public class Herramienta{
	private String nombre;
	private Double costoDiario;

	//constructor
	public Herramienta(String nombre, Double costoDiario) {
		super();
		this.nombre = nombre;
		this.costoDiario = costoDiario;
	}
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCostoDiario() {
		return costoDiario;
	}

	public void setCostoDiario(Double costoDiario) {
		this.costoDiario = costoDiario;
	}
	
	

}
