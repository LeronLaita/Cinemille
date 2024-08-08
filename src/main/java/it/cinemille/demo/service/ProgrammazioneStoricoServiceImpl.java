package it.cinemille.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.cinemille.demo.dto.ProgrammazioneStoricoDto;
import it.cinemille.demo.entity.ProgrammazioneStorico;
import it.cinemille.demo.repository.ProgrammazioneStoricoRepository;

@Service
public class ProgrammazioneStoricoServiceImpl implements ProgrammazioneStoricoService {

	@Autowired
	ProgrammazioneStoricoRepository programmazioneStoricoRepository;

	@Override
	public List<ProgrammazioneStoricoDto> getStoricoFilm() {
		List<ProgrammazioneStorico> programmazioneStoricoList = new ArrayList<>();

		programmazioneStoricoList = (List<ProgrammazioneStorico>) programmazioneStoricoRepository.findAll();

		List<ProgrammazioneStoricoDto> programmazioneListDto = programmazioneStoricoList.stream()
				.map(c -> new ProgrammazioneStoricoDto(c.getId(), c.getNomeFilm(), c.getDescrizione(), c.getSala(),
						c.getDataInizio(), c.getDataFine(), c.isInSala()))
				.toList();

		return programmazioneListDto;
	}
	
	@Override
	public ProgrammazioneStorico getProgrammazioneStoricoByProgrammazioneNameAndInSala(String nomeFilm, boolean inSala){
		
		return programmazioneStoricoRepository.findByNomeFilmAndInSala(nomeFilm, inSala);
	}
	
	@Override
	public ProgrammazioneStorico save(ProgrammazioneStorico programmazioneStorico) {
		return programmazioneStoricoRepository.save(programmazioneStorico);
	}

}
