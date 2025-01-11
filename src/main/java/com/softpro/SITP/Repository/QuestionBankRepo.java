package com.softpro.SITP.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softpro.SITP.model.QuestionBank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public interface QuestionBankRepo extends JpaRepository<QuestionBank, Integer> {
	
	@SuppressWarnings("unchecked")
	default List<QuestionBank> findQuestionByTestname(String testname, int numberOfQuestion, EntityManager entityManager) {
		String sql = "SELECT * FROM questionbank WHERE testname = :testname ORDER BY RAND() LIMIT " + numberOfQuestion;
		Query query = entityManager.createNativeQuery(sql, QuestionBank.class);
		query.setParameter("testname", testname);
		return query.getResultList();
	}

	List<QuestionBank> findByYear(String year);

	boolean existsByTestname(String testname);

	List<QuestionBank> findQuestionByTestname(String testname);

}
