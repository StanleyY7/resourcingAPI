package resourcing.resourcingbackend.resources;

import jakarta.validation.constraints.NotNull;

public class CreateTempDto {
	
	@NotNull
	String firstName;
	
	@NotNull
	String lastName;
	
	// Getters and Setters
	
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
