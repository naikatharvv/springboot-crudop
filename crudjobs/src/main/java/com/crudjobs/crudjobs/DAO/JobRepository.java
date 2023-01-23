package com.crudjobs.crudjobs.DAO;

import com.crudjobs.crudjobs.model.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {}

