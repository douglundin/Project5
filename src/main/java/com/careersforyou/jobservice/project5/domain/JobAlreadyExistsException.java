package com.careersforyou.jobservice.project5.domain;

public class JobAlreadyExistsException extends RuntimeException {
    public JobAlreadyExistsException(String jobid) {
        super("The job with Jobid " + jobid + " already exists.");
    }
}