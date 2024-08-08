package it.cinemille.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "programmazione")
public class Programmazione {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeFilm;
	
	private String descrizione;
	
	private Long sala;
	
	private Date dataInizio;
	
	private Date dataFine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFilm() {
		return nomeFilm;
	}

	public void setNomeFilm(String nomeFilm) {
		this.nomeFilm = nomeFilm;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Long getSala() {
		return sala;
	}

	public void setSala(Long sala) {
		this.sala = sala;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Programmazione(Long id, String nomeFilm, String descrizione, Long sala, Date dataInizio, Date dataFine) {
		super();
		this.id = id;
		this.nomeFilm = nomeFilm;
		this.descrizione = descrizione;
		this.sala = sala;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public Programmazione() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
}
