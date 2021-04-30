package Guia05RomeroCandela;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException() {
		super("El trabajador no esta disponible en esa fecha");
	}
}
