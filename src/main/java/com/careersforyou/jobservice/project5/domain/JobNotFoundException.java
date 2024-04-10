package com.careersforyou.jobservice.project5.domain;

public class JobNotFoundException extends RuntimeException {
    public JobNotFoundException(String jobid) {
        super("The job with Jobid " + jobid + " was not found.");
    }
}