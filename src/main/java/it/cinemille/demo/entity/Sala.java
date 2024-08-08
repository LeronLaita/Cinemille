package it.cinemille.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "sala")
public class Sala {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nomeSala;
	
	private int capienza;
	
	private boolean imax;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	public boolean isImax() {
		return imax;
	}

	public void setImax(boolean imax) {
		this.imax = imax;
	}

	public Sala(long id, String nomeSala, int capienza, boolean imax) {
		super();
		this.id = id;
		this.nomeSala = nomeSala;
		this.capienza = capienza;
		this.imax = imax;
	}

	public Sala() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
}
