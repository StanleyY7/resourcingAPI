package resourcing.resourcingbackend.resources;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class ResourcesService {
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	JobRepository jobRepository;
	
	@Autowired
	TempRepository tempRepository;
	
	// POST
	
	public Job createJob(CreateJobDto data) {
		
		Job newJob = mapper.map(data, Job.class);
		return this.jobRepository.save(newJob);
		
	}
	
	public Temp createTemp(CreateTempDto data) {

		Temp newTemp = mapper.map(data, Temp.class);
		return this.tempRepository.save(newTemp);
	}
	
	// GET
	
	public List<Job> findAllJobs(){
		return this.jobRepository.findAll();
	}
	
	public List<Temp> findAllTemps(){
		return this.tempRepository.findAll();
	}

	public Optional<Job> findByJobId(Long id) {
		return this.jobRepository.findById(id);
	}

	public Optional<Temp> findByTempId(Long id) {
		return this.tempRepository.findById(id);
	}
	
	// PATCH 
}
