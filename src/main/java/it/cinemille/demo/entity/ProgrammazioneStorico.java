package it.cinemille.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "programmazione_storico")
public class ProgrammazioneStorico {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomeFilm;
	
	private String descrizione;
	
	private long sala;
	
	private Date dataInizio;
	
	private Date dataFine;
	
	private boolean inSala;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public long getSala() {
		return sala;
	}

	public void setSala(long sala) {
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

	public boolean isInSala() {
		return inSala;
	}

	public void setInSala(boolean inSala) {
		this.inSala = inSala;
	}

	public ProgrammazioneStorico(long id, String nomeFilm, String descrizione, long sala, Date dataInizio,
			Date dataFine, boolean inSala) {
		super();
		this.id = id;
		this.nomeFilm = nomeFilm;
		this.descrizione = descrizione;
		this.sala = sala;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.inSala = inSala;
	}

	public ProgrammazioneStorico() {
		super();
		//TODO Auto-generated constructor stub
	}

	
}
