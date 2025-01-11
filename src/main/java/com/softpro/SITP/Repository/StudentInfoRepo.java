package com.softpro.SITP.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softpro.SITP.model.StudentInfo;

@Repository
public interface StudentInfoRepo extends JpaRepository<StudentInfo, Long>{

	StudentInfo findByEmail(String email);

	
	List<StudentInfo> findStudentsByStatus(@Param("status") String string);

	@Query("SELECT s FROM StudentInfo s WHERE s.testname NOT IN (SELECT r.testname FROM TestResult r)")
	List<StudentInfo> findStudentWithoutResult();


	StudentInfo getByEmail(String string);


	@Query(value = "SELECT * FROM studentinfoes WHERE (:testname IS NULL OR testname LIKE %:testname%) AND (:collegename IS NULL OR collegename LIKE %:collegename%) AND (:course IS NULL OR course LIKE %:course%) AND (:branch IS NULL OR branch LIKE %:branch%) AND (status =:status)", nativeQuery = true)
	List<StudentInfo> findByDropDownSelect(@Param("testname") String testname, @Param("collegename") String collegename, @Param("course") String course, @Param("branch") String branch, String status);

	//Optional<StudentInfo> findByUserId(String email);
}
