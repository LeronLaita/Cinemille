package it.cinemille.demo.service;

import java.sql.Date;
import java.util.List;

import it.cinemille.demo.dto.ProgrammazioneDto;
import it.cinemille.demo.entity.Programmazione;

public interface ProgrammazioneService {

	
	public List<ProgrammazioneDto> getVisibleFilm();
	
	public void deleteAllFilms();
	
	public Programmazione insertNewFilm(Programmazione programmazione);
	
	public List<ProgrammazioneDto> getFilmsByDateRange(Date dataInizio, Date dataFine);
}
