package com.example.JobSearch.service.impl;

import com.example.JobSearch.dto.JobDTO;
import com.example.JobSearch.entity.JobEntity;
import com.example.JobSearch.repository.JobRepository;
import com.example.JobSearch.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceimpl implements JobService {
    @Autowired
    private JobRepository repo;
    @Override
    public JobDTO createJob(JobDTO jobdto){
        JobEntity j1 = new JobEntity(
                jobdto.getJobId(),
                jobdto.getTitle(),
                jobdto.getLocation()
        );
        JobEntity j2 = repo.save(j1);
        JobDTO j3 = new JobDTO(
                j2.getJobId(),
                j2.getTitle(),
                j2.getLocation()
        );
        return j3;
    }
    public JobEntity getJob(Long jobId){
        return repo.findByjobId(jobId);
    }
    public JobDTO updateJob(Long jodId,JobDTO jobdto){
        JobEntity j4 = repo.findByjobId(jodId);
        j4.setLocation(jobdto.getLocation());
        j4.setTitle(jobdto.getTitle());
        JobEntity j5 = repo.save(j4);
        JobDTO j6 = new JobDTO(
                j5.getJobId(),
                j5.getTitle(),
                j5.getLocation()
        );
        return j6;
    }
    public void deleteJob(Long jobId){
        JobEntity deleted = repo.findByjobId(jobId);
        repo.delete(deleted);
    }

}
