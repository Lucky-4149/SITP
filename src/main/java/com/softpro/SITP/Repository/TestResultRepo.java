package com.softpro.SITP.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.softpro.SITP.model.TestResult;

public interface TestResultRepo extends JpaRepository<TestResult, Long>{

	//@Query(value = "select testname from testresult where email=:email", nativeQuery = true)
	//String getStatusOfStdResult(String email);
	
	@Query(value = "select testname, email from testresult where email=:email and testname=:testname", nativeQuery = true)
	String getSttudentOfStdResult(String email, String testname);

	List<TestResult> findResultByTestname(String testname);

}
