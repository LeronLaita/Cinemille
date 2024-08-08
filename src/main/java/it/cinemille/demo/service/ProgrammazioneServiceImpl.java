package it.cinemille.demo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.cinemille.demo.dto.ProgrammazioneDto;
import it.cinemille.demo.entity.Programmazione;
import it.cinemille.demo.repository.ProgrammazioneRepository;

@Service
public class ProgrammazioneServiceImpl implements ProgrammazioneService {

	@Autowired
	ProgrammazioneRepository programmazioneRepository;

	@Override
	public List<ProgrammazioneDto> getVisibleFilm() {
		List<Programmazione> programmazioneList = new ArrayList<>();

		programmazioneList = (List<Programmazione>) programmazioneRepository.findAll();

		List<ProgrammazioneDto> programmazioneListDto = programmazioneList.stream()
				.map(c -> new ProgrammazioneDto(c.getId(), c.getNomeFilm(), c.getDescrizione(), c.getSala(),
						c.getDataFine(), c.getDataInizio()))
				.toList();

		return programmazioneListDto;
	}

	@Override
	public void deleteAllFilms() {
		programmazioneRepository.deleteAll();
	}

	@Override
	public Programmazione insertNewFilm(Programmazione programmazione) {
		return programmazioneRepository.save(programmazione);
	}

	@Override
	public List<ProgrammazioneDto> getFilmsByDateRange(Date dataInizio, Date dataFine) {
		List<Programmazione> programmazioneList = new ArrayList<>();

		programmazioneList = (List<Programmazione>) programmazioneRepository
				.findByDataInizioGreaterThanEqualAndDataFineLessThanEqual(dataInizio, dataFine);

		List<ProgrammazioneDto> programmazioneListDto = programmazioneList.stream()
				.map(c -> new ProgrammazioneDto(c.getId(), c.getNomeFilm(), c.getDescrizione(), c.getSala(),
						c.getDataInizio(),c.getDataFine()))
				.toList();

		return programmazioneListDto;
	}

}
