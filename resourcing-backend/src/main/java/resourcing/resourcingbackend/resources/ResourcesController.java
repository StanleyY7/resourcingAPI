package resourcing.resourcingbackend.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class ResourcesController {

	@Autowired
	private ResourcesService resourcesService;
	
	public ResourcesController(ResourcesService resourcesService) {
		this.resourcesService = resourcesService;
	}
	
	// POST
	
	@PostMapping("/jobs")
	public ResponseEntity<Job> createJob(@Valid @RequestBody CreateJobDto data) {
		Job createdJob = this.resourcesService.createJob(data);
		return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
	}
	
	@PostMapping("/temps")
	public ResponseEntity<Temp> createTemp(@Valid @RequestBody CreateTempDto data) {
		Temp createdTemp = this.resourcesService.createTemp(data);
		return new ResponseEntity<>(createdTemp, HttpStatus.CREATED);
	}
	
	// GET ALL
	
	@GetMapping("/jobs")
	public ResponseEntity<List<Job>> findAllJobs(){
		List<Job> allJobs = this.resourcesService.findAllJobs();
		return new ResponseEntity<>(allJobs, HttpStatus.OK);
	}
	
	@GetMapping("/temps")
	public ResponseEntity<List<Temp>> findAllTemps(){
		List<Temp> allTemps = this.resourcesService.findAllTemps();
		return new ResponseEntity<>(allTemps, HttpStatus.OK);
	}
	
	
	// GET BY ID
	
	@GetMapping("/jobs/{id}")
	public ResponseEntity<Job> getByJobId(@PathVariable Long id){
		Optional<Job> maybeJob = this.resourcesService.findByJobId(id);
		if (maybeJob.isEmpty()){
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

			}

			return new ResponseEntity<>(maybeJob.get(), HttpStatus.OK);
	}
	
	@GetMapping("/temps/{id}")
	public ResponseEntity<Temp> getByTempId(@PathVariable Long id){
		Optional<Temp> maybeTemp = this.resourcesService.findByTempId(id);
		if (maybeTemp.isEmpty()){
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

			}

			return new ResponseEntity<>(maybeTemp.get(), HttpStatus.OK);
	}
	
	
}
