package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgramingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService{
	
	private ProgramingLanguagesRepository programingLanguagesRepository;
	
	@Autowired
	public ProgramingLanguageManager(ProgramingLanguagesRepository programingLanguagesRepository) {
		super();
		this.programingLanguagesRepository = programingLanguagesRepository;
	}

	@Override
	public List<ProgramingLanguages> getAll() {
		// TODO Auto-generated method stub
		return programingLanguagesRepository.getAll();
	}

	@Override
	public ProgramingLanguages getById(int id) {
		// TODO Auto-generated method stub
		return programingLanguagesRepository.getById(id);
	}

	@Override
	public void add(ProgramingLanguages programingLanguage) throws Exception {
		// TODO Auto-generated method stub
		
		if(programingLanguage.getProgramingName().isEmpty()) {
			throw new Exception("Programing language cannot be entered empty!");
		} else {
			for (ProgramingLanguages language: programingLanguagesRepository.getAll()) {
				if(language.getProgramingName().equals(programingLanguage.getProgramingName())) {
					throw new Exception("Programing language already exist.");
					
				} else {
					programingLanguagesRepository.add(programingLanguage);
				}
				
			}
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		programingLanguagesRepository.delete(id);
		
	}

	@Override
	public void update(ProgramingLanguages programingLanguage) {
		// TODO Auto-generated method stub
		programingLanguagesRepository.update(programingLanguage);
		
	}
	
	
	
	

}
