package resourcing.resourcingbackend.resources;

import jakarta.validation.constraints.NotNull;

public class CreateTempDto {
	
	@NotNull
	String firstName;
	
	@NotNull
	String lastName;
	
	CreateJobDto jobs;
	
	// Getters and Setters
	
	public CreateJobDto getJobs() {
		return jobs;
	}

	public void setJobs(CreateJobDto jobs) {
		this.jobs = jobs;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
