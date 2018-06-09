package com.startup.job.application;

import com.startup.job.infrastructure.repository.JobRepository;
import com.startup.job.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class JobApplication {

    private JobRepository jobRepository;

    @Autowired
    public JobApplication(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Job job) {
        jobRepository.save(job);
    }
}
