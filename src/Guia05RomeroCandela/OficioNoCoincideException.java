package Guia05RomeroCandela;

public class OficioNoCoincideException extends Exception {
	
	public OficioNoCoincideException() {
		super("El oficio del trabajador no cubre la tarea a agregar");
	}
}
