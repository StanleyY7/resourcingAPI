package resourcing.resourcingbackend.resources;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jobs")
public class Job {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
	
	@Column
	String name;
	
	@Column
	LocalDate startDate;

	@Column
	LocalDate endDate;
	
	// Getters and Setters
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
	
	// Constructors
	
	public Job(Long id, String name, LocalDate startDate, LocalDate endDate) {
		super();
		Id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Job() {}
	
}
