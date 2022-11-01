package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.dataAccess.abstracts.ProgramingLanguagesRepository;
import Kodlama.io.Devs.entities.concretes.ProgramingLanguages;

public class InMemoryLanguageRepository implements ProgramingLanguagesRepository {
	
	List<ProgramingLanguages> programingLanguages;
	
	// InMemory i calıstırılınca bu kısım new lenecektir
	public InMemoryLanguageRepository() {
		programingLanguages = new ArrayList<ProgramingLanguages>();
		
		programingLanguages.add(new ProgramingLanguages(1,"#C"));
		programingLanguages.add(new ProgramingLanguages(2,"Python"));
		programingLanguages.add(new ProgramingLanguages(3,"Java"));
		programingLanguages.add(new ProgramingLanguages(4,"R"));
		programingLanguages.add(new ProgramingLanguages(5,"Go"));
		
		
	}

	@Override
	public List<ProgramingLanguages> getAll() {
		// TODO Auto-generated method stub
		return programingLanguages;
	}

	@Override
	public ProgramingLanguages getById(int id) {
		// TODO Auto-generated method stub
		for (ProgramingLanguages programingLanguage : programingLanguages) {
			if(programingLanguage.getId() == id) {
				return programingLanguage;
			}
			
		}
		
		return null;
	}

	@Override
	public void add(ProgramingLanguages programingLanguage) {
		
		programingLanguages.add(programingLanguage);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		ProgramingLanguages deleteProgramingLanguages = getById(id);
		programingLanguages.remove(id);
		System.out.println(deleteProgramingLanguages + " programing language is deleted.");
		
	}

	@Override
	public void update(ProgramingLanguages programingLanguage) {
		// TODO Auto-generated method stub
		ProgramingLanguages updateProgramingLanguages = getById(programingLanguage.getId());
		updateProgramingLanguages.setProgramingName(programingLanguage.getProgramingName());
		System.out.println(programingLanguage + " is updated to "+ updateProgramingLanguages);
		
	}

}
