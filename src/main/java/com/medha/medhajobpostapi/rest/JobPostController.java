package com.medha.medhajobpostapi.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medha.medhajobpostapi.dto.JobPost;
import com.medha.medhajobpostapi.model.jobEntity;
import com.medha.medhajobpostapi.service.JobPostService;

@RestController
public class JobPostController {
	@Autowired
	private JobPostService jobSaveService;
	
	@PostMapping("/saveJob")
	public String saveJob(@RequestBody JobPost jobpostreq) {

		  String s = jobSaveService.SaveNewAdd(jobpostreq);
		return s;
	}
	
	
	@GetMapping("/searchJob")
	public Optional<jobEntity> searchJob(@RequestParam(name = "JobID") String JobID) {
		
		return jobSaveService.searchJob(JobID) ;
		
			
	}
	@GetMapping("/searchAllJob")
	public List<jobEntity> searchAllJob() {
		
		return jobSaveService.findAll() ;
		
			
	}
	@DeleteMapping(value = "/deleteposts")
	 public String deleteJob(@RequestParam(name = "JobID") String JobID) {
			
			try {
				return jobSaveService.deleteJob(JobID);
			} catch (Exception e) {
				return e.getMessage();
			}
	}
	@PutMapping("/updateJobPost")
	 public JobPost updateJob(@RequestBody JobPost jobpostreq) {
	
		 try {
			 JobPost jobPost= jobSaveService.updateJob(jobpostreq);
			 return jobPost;
			} catch(NullPointerException ne) {
				JobPost jobPostException = new JobPost(); 
				jobPostException.setErrorString(ne.getMessage());
				return jobPostException;
			}
		 catch (Exception e) {
				JobPost jobPostException = new JobPost(); 
				jobPostException.setErrorString(e.getMessage());
				return jobPostException;
			}
		 
	}
}
