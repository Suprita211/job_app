package com.FirstApp.JobApplication.Repository;

import com.FirstApp.JobApplication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
