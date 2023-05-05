package resourcing.resourcingbackend.resources;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="temps")
public class Temp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long Id;
	
	@Column
	String firstName;
	
	@Column 
	String lastName;
	
	@OneToOne
	@JoinColumn(name="job_id")
	Job job;
	
	// Getters and Setters
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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
	
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job job) {
		this.job = job;
	}
	
	// Constructors
	
	public Temp(Long id, String firstName, String lastName, Job job) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
	}
	public Temp() {}
}
