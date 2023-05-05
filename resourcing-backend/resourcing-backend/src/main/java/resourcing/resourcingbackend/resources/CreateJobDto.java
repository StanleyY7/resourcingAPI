package resourcing.resourcingbackend.resources;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public class CreateJobDto {

	@NotNull
	String name;

	@NotNull
	LocalDate startDate;

	@NotNull
	LocalDate endDate;
	
	CreateTempDto temp;
	
	// Getters and Setters
	
	public CreateTempDto getTemp() {
		return temp;
	}

	public void setTemp(CreateTempDto temp) {
		this.temp = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

}
