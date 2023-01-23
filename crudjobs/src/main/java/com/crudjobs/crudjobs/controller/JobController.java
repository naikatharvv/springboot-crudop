package com.crudjobs.crudjobs.controller;

import com.crudjobs.crudjobs.DAO.JobRepository;
import com.crudjobs.crudjobs.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")

@RestController


@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    //Create
    @PostMapping

    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    //Read
    @GetMapping("/{id}")

    public Job getJob(@PathVariable Long id) {
        return jobRepository.findById(id).orElse(null);
    }
    @GetMapping

    public Iterable<Job> getAllJobs() {
        return jobRepository.findAll();
    }
    //Update
    @PutMapping("/{id}")

    public Job updateJob(@PathVariable Long id, @RequestBody Job job) {
        Job currentJob = jobRepository.findById(id).orElse(null);
        if(currentJob != null) {
            currentJob.setTitle(job.getTitle());
            currentJob.setDescription(job.getDescription());
            currentJob.setLocation(job.getLocation());
            currentJob.setSalary(job.getSalary());
            return jobRepository.save(currentJob);
        }
        return null;
    }

    //Delete
    @DeleteMapping("/{id}")

    public void deleteJob(@PathVariable Long id) {
        jobRepository.deleteById(id);
    }

}