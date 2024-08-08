package it.cinemille.demo.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.cinemille.demo.entity.Programmazione;

@Repository
public interface ProgrammazioneRepository extends CrudRepository<Programmazione, Long>{

	
	List<Programmazione> findByDataInizioGreaterThanEqualAndDataFineLessThanEqual(Date dataInizio, Date dataFine);
}
