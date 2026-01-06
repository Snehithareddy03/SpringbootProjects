package com.example.JobSearch.controller;


import com.example.JobSearch.dto.JobDTO;
import com.example.JobSearch.entity.JobEntity;
import com.example.JobSearch.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job")
public class JobController {
    @Autowired
    private JobService service;
    @PostMapping("/save")
    public ResponseEntity<JobDTO> createJob(@RequestBody  JobDTO jobdto){
        JobDTO j1 = service.createJob(jobdto);
        return new ResponseEntity<>(j1, HttpStatus.CREATED);
    }
    @GetMapping("/{jobId}")
    public ResponseEntity<JobEntity> getJob(@PathVariable Long jobId){
        JobEntity j2 = service.getJob(jobId);
        return new ResponseEntity<>(j2,HttpStatus.OK);
    }
    @PutMapping("/{jobId}")
    public ResponseEntity<JobDTO> updateJob(@PathVariable Long jobId,@RequestBody JobDTO jobdto){
            JobDTO j3 = service.updateJob(jobId,jobdto);
            return new ResponseEntity<>(j3,HttpStatus.CREATED);
    }
    @DeleteMapping("/{jobId}")
    public ResponseEntity<String> deleteJob(@PathVariable Long jobId){
        service.deleteJob(jobId);
        return ResponseEntity.ok("deleted successfully");
    }
}
