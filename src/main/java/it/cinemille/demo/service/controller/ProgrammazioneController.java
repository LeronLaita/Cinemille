package it.cinemille.demo.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.cinemille.demo.dto.FilterDateDto;
import it.cinemille.demo.dto.ProgrammazioneDto;
import it.cinemille.demo.service.ProgrammazioneService;

@RestController
@RequestMapping("api/demo")
public class ProgrammazioneController {

	@Autowired
	ProgrammazioneService programmazioneService;
	
	@GetMapping(path = "/list")
	public List<ProgrammazioneDto> getAllFilms(){
		return programmazioneService.getVisibleFilm();
	}
	
	@PostMapping(path = "/filter")
	public List<ProgrammazioneDto> getFilteredFilms(@RequestBody FilterDateDto filterDate){
		return programmazioneService.getFilmsByDateRange(filterDate.getDataInizio(), filterDate.getDataFine());

	}
}
