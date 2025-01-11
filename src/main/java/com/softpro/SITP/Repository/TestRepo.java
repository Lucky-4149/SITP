package com.softpro.SITP.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.softpro.SITP.model.Test;

public interface TestRepo extends JpaRepository<Test, Long>{

	@Query(value = "SELECT * FROM testinfo WHERE teststatus = 'Active' OR teststatus = 'Scheduled'", nativeQuery = true)
	List<Test> findByTeststatus();

	boolean existsByTestname(String testname);

	@Query(value = "SELECT * FROM testinfo WHERE testname =:testname", nativeQuery = true)
	Test findByTestname(String testname);

	@Query(value = "SELECT * FROM testinfo", nativeQuery = true)
	List<Test> findTestname();

	
}
