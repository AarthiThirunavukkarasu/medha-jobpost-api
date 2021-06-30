package com.medha.medhajobpostapi.service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import com.medha.medhajobpostapi.dto.JobPost;
import com.medha.medhajobpostapi.model.jobEntity;
import com.medha.medhajobpostapi.repository.JobPostRep;
import com.medha.medhajobpostapi.service.JobPostService;

@EnableMongoRepositories(basePackages ="com.medha.medhajobpostapi.repository")
@Service
public class JobPostServiceImpl implements JobPostService {
	@Autowired
	JobPostRep jobPostRep;
	@Override
	public String SaveNewAdd(JobPost jobpostreq) {
		try {
			
			  jobEntity jobpostDto = new jobEntity(); 
			  BeanUtils.copyProperties(jobpostreq,
			  jobpostDto);
			 
			String ID =UUID.randomUUID ().toString ();
			jobpostDto.setJob_ID(ID);
			jobpostDto.setId(ID);
			jobPostRep.insert(jobpostDto);
			return jobpostDto.getJob_ID() ;
			}
			catch(Exception e)
			{
				return e.getMessage();
			}
		}
		
public static String createID() {
	/*
	 * long r = 0; synchronized (lock) { r = (long) ((Math.random() + 1) * w); }
	 * UUID.randomUUID ().toString (); return UUID.randomUUID ().toString ();// +
	 * String.valueOf(r).substring(1);
	 */	Random rand = new Random();
	 int max =10;
	int min=1;
	int randomNum = rand.nextInt((max - min) + 1) + min;
	 long time = System.currentTimeMillis();
	 String uniqueValue ="ID"+""+ randomNum+""+time;
     return uniqueValue.toString();
}

	@Override
	public Optional<jobEntity> searchJob(String JobID) {
		
		
		
			 Optional<jobEntity> jobpostDto = jobPostRep.findById(JobID);
			 return jobpostDto;
		/* JobPost jobpostres = new JobPost();
		 BeanUtils.copyProperties(jobpostDto, jobpostres);
		 return  jobpostres; 
	}
		 catch(IllegalArgumentException ae) { 
			 JobPost jobpostexpectionRes  = new JobPost();
			 jobpostexpectionRes.setErrorString("Either ID or JObID is incorrect"); 
			 return jobpostexpectionRes;}
		
		
		
		
	
	catch(Exception e) { 
	 JobPost jobpostexpectionRes = new JobPost();
	 jobpostexpectionRes.setErrorString(e.getMessage()); 
	 return jobpostexpectionRes; 
	 }*/
	
}
	

	@Override
	public String deleteJob(String iD) throws Exception {
		try {
		jobPostRep.deleteById(iD);
		
		return "Sucess";
		}
		catch (Exception e ) {
			throw new Exception ("Unable to delete the Job Post");
		}
	}

	@Override
	public JobPost updateJob(JobPost jobpostreq) throws Exception {
		Optional<jobEntity> checkjobpost = jobPostRep.findById(jobpostreq.getId());
		if(checkjobpost!=null) {
			jobEntity jobpostDto = new jobEntity();
		//if((checkjobpost.getID().equalsIgnoreCase(jobpostreq.getID()))&&(checkjobpost.getID().equalsIgnoreCase(jobpostreq.getJobID())))
		BeanUtils.copyProperties(jobpostreq, jobpostDto);
		jobPostRep.save(jobpostDto);
		}
		else {
			throw new NullPointerException("No user found , Either ID or JObID is incorrect .please try again with correct Information");
		}
		return jobpostreq ;
	}

	@Override
	public List<jobEntity> findAll() {
		// TODO Auto-generated method stub
		return jobPostRep.findAll();
	}

}
