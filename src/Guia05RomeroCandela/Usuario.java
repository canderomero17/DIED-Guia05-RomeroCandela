package Guia05RomeroCandela;

import java.util.List;

public class Usuario {
	private String email;
	private List<Contratable> itemsContratados;
	
	//constructor
	public Usuario(String email, List<Contratable> itemsContratados) {
		super();
		this.email = email;
		this.itemsContratados = itemsContratados;
	}

	//getters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Contratable> getItemsContratados() {
		return itemsContratados;
	}
	public void setItemsContratados(List<Contratable> itemsContratados) {
		this.itemsContratados = itemsContratados;
	}
	
	//contratar
	public void Contratar(Contratable c1) throws AlquilerNoEntregadoException {
		int j=0;
		for(int i=0;i<itemsContratados.size();i++) {
			if(itemsContratados.get(i).finalizado()==false) {
			j++;
				if(j>2) {
					throw new AlquilerNoEntregadoException();
				}
			}
		}
		itemsContratados.add(c1);
	}
	

}
