package it.cinemille.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.cinemille.demo.entity.ProgrammazioneStorico;

@Repository
public interface ProgrammazioneStoricoRepository extends CrudRepository<ProgrammazioneStorico, Long>{

	
	ProgrammazioneStorico findByNomeFilmAndInSala(String nome, boolean inSala);
}
