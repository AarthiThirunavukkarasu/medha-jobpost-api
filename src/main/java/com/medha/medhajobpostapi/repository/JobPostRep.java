package com.medha.medhajobpostapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.medha.medhajobpostapi.model.jobEntity;
@Repository 
public interface JobPostRep extends MongoRepository<jobEntity, String> {

}
