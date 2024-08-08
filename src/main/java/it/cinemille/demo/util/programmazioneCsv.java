package it.cinemille.demo.util;

import java.sql.Date;

public class programmazioneCsv {

	private String nomeFilm;
	
	private String descrizione;
	
	private String sala;
	
	private String dataInizio;
	
	private String dataFine;

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

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	public String getDataFine() {
		return dataFine;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public programmazioneCsv(String nomeFilm, String descrizione, String sala, String dataInizio, String dataFine) {
		super();
		this.nomeFilm = nomeFilm;
		this.descrizione = descrizione;
		this.sala = sala;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public programmazioneCsv() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	
	
}

