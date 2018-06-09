package com.startup.job.infrastructure.controller;


import com.startup.job.application.JobApplication;
import com.startup.job.infrastructure.http.JobModel;
import com.startup.job.infrastructure.http.Response;
import com.startup.job.model.Job;
import com.startup.job.model.factory.JobApplicationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
@RefreshScope
public class JobController {

    private JobApplication jobApplication;

    @Value("${url}")
    private String url;

    @Autowired
    public JobController(JobApplication jobApplication) {
        this.jobApplication = jobApplication;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response create(@RequestBody JobModel jobModel) {
        Job job = JobApplicationFactory.toDomain(jobModel);
        jobApplication.save(job);
        return new Response("OK", url);
    }


}
