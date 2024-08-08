package it.cinemille.demo.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.cinemille.demo.dto.ProgrammazioneDto;
import it.cinemille.demo.dto.ProgrammazioneStoricoDto;
import it.cinemille.demo.service.ProgrammazioneService;
import it.cinemille.demo.service.ProgrammazioneStoricoService;

@RestController
@RequestMapping("api/demo")
public class StoricoController {
	
	@Autowired
	ProgrammazioneStoricoService storicoService;
	
	@GetMapping(path = "/storico")
	public List<ProgrammazioneStoricoDto> getAllFilms(){
		return storicoService.getStoricoFilm();
	
	}
}
