package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;

@RestController
@RequestMapping("/api/programinglanguages")

public class ProgramingLanguagesController {
	
	private ProgramingLanguageService programingLanguageService;
	
	@Autowired
	public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
		super();
		this.programingLanguageService = programingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgramingLanguages> getAll(){
		return programingLanguageService.getAll();
		
	}
	
	@GetMapping("/getId")
	public ProgramingLanguages getById(int id) {
		return programingLanguageService.getById(id);
		
	}
	
	@PutMapping("/add")
	public void add(ProgramingLanguages programingLanguage) throws Exception {
		programingLanguageService.add(programingLanguage);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id) {
		programingLanguageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(ProgramingLanguages programingLanguage) {
		programingLanguageService.update(programingLanguage);
	}
	
	
	

}
