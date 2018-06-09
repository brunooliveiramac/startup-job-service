package com.startup.job.model.factory;

import com.startup.job.infrastructure.http.JobModel;
import com.startup.job.model.Job;

public class JobApplicationFactory {

    public static Job toDomain(JobModel jobModel) {
        return Job.builder().desciption(jobModel.getDescription()).name(jobModel.getName()).build();
    }
}
