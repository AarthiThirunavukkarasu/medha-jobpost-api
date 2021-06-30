package com.medha.medhajobpostapi.service;

import java.util.List;
import java.util.Optional;

import com.medha.medhajobpostapi.dto.JobPost;
import com.medha.medhajobpostapi.model.jobEntity;


public interface JobPostService {
	public String SaveNewAdd(JobPost jobpostreq) ;
	public Optional<jobEntity> searchJob(String JobID) ;
	public String deleteJob(String iD) throws Exception;
	public JobPost updateJob(JobPost jobpostreq) throws Exception;
	public List<jobEntity> findAll();
}
