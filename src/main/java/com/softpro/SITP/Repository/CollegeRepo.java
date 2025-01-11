package com.softpro.SITP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softpro.SITP.model.Colleges;

@Repository
public interface CollegeRepo extends JpaRepository<Colleges, Long>{

	boolean existsByCollegename(String collegename);

	
}
