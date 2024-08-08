package it.cinemille.demo.dto;

import java.sql.Date;

public class FilterDateDto {

	private Date dataInizio;
	private Date dataFine;

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

	public FilterDateDto(Date dataInizio, Date dataFine) {
		super();
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public FilterDateDto() {
		super();
	}

}
