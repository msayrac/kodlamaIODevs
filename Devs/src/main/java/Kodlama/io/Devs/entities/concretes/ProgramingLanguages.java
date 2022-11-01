package Kodlama.io.Devs.entities.concretes;

public class ProgramingLanguages {
	
	// this part is for the project entities.
	
	private int id;
	private String programingName;
	
	public ProgramingLanguages() {
		super();
		
	}

	public ProgramingLanguages(int id, String programingName) {
		super();
		this.id = id;
		this.programingName = programingName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgramingName() {
		return programingName;
	}

	public void setProgramingName(String programingName) {
		this.programingName = programingName;
	}

	
	
	
	
	
	

}
