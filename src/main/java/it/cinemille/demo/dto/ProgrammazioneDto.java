package it.cinemille.demo.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ProgrammazioneDto {

	private long id;

	private String nomeFilm;

	private String descrizione;

	private long sala;

	private Date dataInizio;

	private Date dataFine;

	public ProgrammazioneDto() {
	};

	public ProgrammazioneDto(long id, String nomeFilm, String descrizione, long sala, Date dataInizio, Date dataFine) {
		super();
		this.id = id;
		this.nomeFilm = nomeFilm;
		this.descrizione = descrizione;
		this.sala = sala;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

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

}
