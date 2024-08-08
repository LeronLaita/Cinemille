package it.cinemille.demo.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.cinemille.demo.entity.Programmazione;
import it.cinemille.demo.entity.ProgrammazioneStorico;
import it.cinemille.demo.service.ProgrammazioneService;
import it.cinemille.demo.service.ProgrammazioneStoricoService;

@RestController
public class CsvReaderController {
	
	@Autowired
	ProgrammazioneStoricoService programmazioneStoricoService; 
	
	@Autowired
	ProgrammazioneService programmazioneService; 

	@GetMapping("/importcsv")
	public void getCsv() throws ParseException
    {
 
        // Hashmap to map CSV data to 
        // Bean attributes.
        Map<String, String> mapping = new
                      HashMap<String, String>();
        mapping.put("nome_film", "nomeFilm");
        mapping.put("descrizione", "descrizione");
        mapping.put("sala", "sala");
        mapping.put("data_inizio", "dataInizio");
        mapping.put("data_fine", "dataFine");
 
        // HeaderColumnNameTranslateMappingStrategy
        // for Student class
        HeaderColumnNameTranslateMappingStrategy<programmazioneCsv> strategy =
             new HeaderColumnNameTranslateMappingStrategy<programmazioneCsv>();
        strategy.setType(programmazioneCsv.class);
        strategy.setColumnMapping(mapping);
 
        // Create csvtobean and csvreader object
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
            ("C:\\Users\\Betacom\\Desktop\\CineMille\\demo\\src\\main\\resources\\film.csv"));
        }
        catch (FileNotFoundException e) {
 
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();
 
        // call the parse method of CsvToBean
        // pass strategy, csvReader to parse method
        List<programmazioneCsv> list = csvToBean.parse(strategy, csvReader);
 
        if (!list.isEmpty()) {
        	
			programmazioneService.deleteAllFilms();
		} else {
			throw new RuntimeException("Errore nella lettura del CSV");
		}
        
        // print details of Bean object
        List<Programmazione> film = createListOfFilm(list);
        for (Programmazione e : film) {
        	ProgrammazioneStorico programmazioneStorico = programmazioneStoricoService.getProgrammazioneStoricoByProgrammazioneNameAndInSala(e.getNomeFilm(), true);
        	if (programmazioneStorico != null) {
        		programmazioneStorico.setInSala(false);
				programmazioneStoricoService.save(programmazioneStorico);
			}else {
				ProgrammazioneStorico newStorico = new ProgrammazioneStorico();
				newStorico.setNomeFilm(e.getNomeFilm());
				newStorico.setDescrizione(e.getDescrizione());
				newStorico.setSala(e.getSala());
				newStorico.setDataInizio(e.getDataInizio());
				newStorico.setDataFine(e.getDataFine());
				newStorico.setInSala(true);
				programmazioneStoricoService.save(newStorico);
			}
        	programmazioneService.insertNewFilm(e);
        	
        }
    }

	private List<Programmazione> createListOfFilm(List<programmazioneCsv> list) throws ParseException {
		List<Programmazione> programmazioneList = new ArrayList<>();
		for(programmazioneCsv csv : list) {
			Programmazione p = new Programmazione();
			p.setNomeFilm(csv.getNomeFilm());
			p.setDescrizione(csv.getDescrizione());
			p.setSala(Long.valueOf(csv.getSala()));
			p.setDataInizio(convertStringToDate(csv.getDataInizio()));
			p.setDataFine(convertStringToDate(csv.getDataFine()));
			programmazioneList.add(p);
		}
		return programmazioneList;
	}
		
	private java.sql.Date convertStringToDate(String date) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date parsed = format.parse(date);
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
        return sql;
	}
		
}
