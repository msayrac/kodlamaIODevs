package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;

public interface ProgramingLanguageService {
	
	
	
	List<ProgramingLanguages> getAll();
	
	ProgramingLanguages getById(int id);
	
	void add(ProgramingLanguages programingLanguage) throws Exception;
	
	void delete(int id);
	
	void update(ProgramingLanguages programingLanguage);

}
