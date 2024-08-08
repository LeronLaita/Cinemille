package it.cinemille.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.cinemille.demo.entity.Sala;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long>{

}
