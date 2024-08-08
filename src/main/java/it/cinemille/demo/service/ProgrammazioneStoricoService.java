package it.cinemille.demo.service;

import java.util.List;

import it.cinemille.demo.dto.ProgrammazioneStoricoDto;
import it.cinemille.demo.entity.ProgrammazioneStorico;

public interface ProgrammazioneStoricoService {
	
	public List<ProgrammazioneStoricoDto> getStoricoFilm();
	
	public ProgrammazioneStorico getProgrammazioneStoricoByProgrammazioneNameAndInSala(String nomeFilm, boolean inSala);

	public ProgrammazioneStorico save(ProgrammazioneStorico programmazioneStorico);
}
