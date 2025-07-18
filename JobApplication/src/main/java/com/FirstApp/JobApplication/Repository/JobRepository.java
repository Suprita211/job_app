package com.FirstApp.JobApplication.Repository;

import com.FirstApp.JobApplication.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
