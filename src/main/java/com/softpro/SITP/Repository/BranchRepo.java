package com.softpro.SITP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softpro.SITP.model.Branches;

@Repository
public interface BranchRepo extends JpaRepository<Branches, Long>{

	boolean existsByBranchname(String branchname);
}
