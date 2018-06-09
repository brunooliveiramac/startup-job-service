package com.startup.job.infrastructure.repository;

import com.startup.job.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository <Job, Integer>{
}
