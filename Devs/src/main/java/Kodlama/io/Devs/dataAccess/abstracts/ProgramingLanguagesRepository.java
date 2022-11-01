package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;

public interface ProgramingLanguagesRepository {
	
	
	// List all languages
	List<ProgramingLanguages> getAll();
	
	// brings all languages by ID	
	ProgramingLanguages getById(int id);
	
	// add language
	void add(ProgramingLanguages programingLanguages);
	
	// delete language
	void delete(int id);
	
	// update language
	void update(ProgramingLanguages programingLanguages);
	
	
	
	
	
	

}
