package Guia05RomeroCandela;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("Tiene dos o mas alquileres sin devolver");
	}
	
}
